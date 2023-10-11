package services;

import dtos.CompositeDto;
import entities.Composant;
import entities.Composite;
import org.springframework.stereotype.Service;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class Facade {
    @PersistenceContext
    EntityManager em;


    public List<Composite> findAllCompositesPlante() {
        return em.createQuery("Select c From Composite c").getResultList();
    }

    @Transactional
    public List<Composite> findAllCompositesManuel() {
        List<Composite> lc=em.createQuery("Select c From Composite c").getResultList();
        for (Composite c:lc){
            c.getComposants().size();
        }
        return lc;
    }

    public List<Composite> findAllCompositesFetchJoin() {
        return em.createQuery("Select distinct c From Composite c left join fetch c.composants").getResultList();
    }

    public List<Composite> findAllCompositesEntityGraph() {
        EntityGraph<Composite> eg=em.createEntityGraph(Composite.class);
        eg.addSubgraph("composants");

        Query q=em.createQuery("Select distinct c From Composite c");
        q.setHint("javax.persistence.loadgraph",eg);
        // q.setHint("javax.persistence.fetchgraph",eg);
        return q.getResultList();
    }

    public List<CompositeDto> findAllCompositesDto() {
        // On décompose **exagérément** la récupération des informations pour illustrer, comme si on accédait à des infos disparates.
        // Ce n'est évidemment pas le cas ici.
        // Donc à éviter (il aurait mieux valu faire ce qui est commenté en fin de méthode )
        List<Composite> lc=em.createQuery("Select c From Composite c").getResultList();
        List<CompositeDto> dtos=new ArrayList<>();
        for (Composite compo:lc) {
            List<Composant> composants=em.createQuery("Select c From Composant c where c.composite=:compo").setParameter("compo",compo).getResultList();
            CompositeDto dto=new CompositeDto(compo.getIdComposite(),compo.getNomComposite(),composants);
            dtos.add(dto);
        }
        return dtos;

        // List<Composite> lc=findAllCompositesEntityGraph();
        // return lc.stream().map(c -> new CompositeDto(c)).collect(Collectors.toCollection(ArrayList::new));
    }

}
