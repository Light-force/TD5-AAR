package services;

import entities.Employe;
import org.springframework.stereotype.Service;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@Service
public class Facade {
    @PersistenceContext
    EntityManager em;

    @Transactional
    public Employe findEmployeById(int idEmploye) {
        EntityGraph<?> graph = em.getEntityGraph("graphe.Employe.detail");
        Map<String, Object> properties = new HashMap<>();
        properties.put("javax.persistence.fetchgraph", graph);
        return em.find(Employe.class, idEmploye, properties);
    }
}
