package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

//@Entity
//@IdClass(ClientKeyIDC.class)
public class ClientAvecCleIDClass implements Serializable {
    @Id
    private String nom;
    @Id
    private String prenom;

    public ClientAvecCleIDClass() {}

    public ClientAvecCleIDClass(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
