package services;

import entities.*;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class Facade {
    @PersistenceContext
    EntityManager em;

    @Transactional
    public void peuple() {
        em.persist(new AvecAuto());
        em.persist(new AvecSequence());
        em.persist(new AvecTablePremiere());
        em.persist(new AvecTableSeconde());


        //em.persist(new ClientAvecCleIDClass("Paul","Scorbut"));
        //em.persist(new ClientAvecCleEmbedded("Paul","Scorbut"));

    }


}
