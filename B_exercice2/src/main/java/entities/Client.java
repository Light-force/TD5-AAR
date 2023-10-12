package entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.time.LocalDate;

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class Client extends Personne {
    private String numInsee;
    private LocalDate dateEmbauche;

    public String getNumInsee() {
        return numInsee;
    }

    public void setNumInsee(String numInsee) {
        this.numInsee = numInsee;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
}
