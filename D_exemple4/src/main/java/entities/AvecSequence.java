package entities;

import javax.persistence.*;

@Entity
public class AvecSequence {
    @SequenceGenerator(name = "seqAS",sequenceName = "SEQAS")
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqAS")
    private int key;

    public int getKey() {
        return key;
    }
}
