package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AvecAuto {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int key;

    public int getKey() {
        return key;
    }
}
