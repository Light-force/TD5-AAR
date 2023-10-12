package services;

import entities.Client;
import entities.Employe;
import entities.Personne;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class Facade {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public void createEmploye() {

        Personne personne = new Personne();
        personne.setNomPers("Dupond");
        personne.setPrenomPers("Toto");

        Employe employe = new Employe();

        employe.setNomPers(personne.getNomPers());
        employe.setPrenomPers(personne.getPrenomPers());
        employe.setEmail("xxxx@exemple.fr");
        employe.setDateAnniversaire(LocalDate.of(1994, 12, 14));

        em.persist(employe);

        Client client = new Client();

        client.setNomPers(personne.getNomPers());
        client.setPrenomPers(personne.getPrenomPers());
        client.setNumInsee("12547271C");
        client.setDateEmbauche(LocalDate.of(2020, 8, 29));

        em.persist(client);
    }
}
