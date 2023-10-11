package services;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class Facade {
    @PersistenceContext
    EntityManager em;




}
