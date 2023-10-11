package entities;

import javax.persistence.*;

@Entity
public class AvecTableSeconde {
    @TableGenerator(name = "tableAT",table = "TABLEAT",pkColumnName = "PKCOL",pkColumnValue = "SECONDE")
    @Id @GeneratedValue(strategy = GenerationType.TABLE,generator = "tableAT")
    private int key;

    public int getKey() {
        return key;
    }
}
