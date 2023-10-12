package entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDate;

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class Employe extends Personne{
    private String email;
    private LocalDate dateAnniversaire;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateAnniversaire() {
        return dateAnniversaire;
    }

    public void setDateAnniversaire(LocalDate dateAnniversaire) {
        this.dateAnniversaire = dateAnniversaire;
    }
}
