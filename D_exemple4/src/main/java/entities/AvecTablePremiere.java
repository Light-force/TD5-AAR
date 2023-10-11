package entities;

import javax.persistence.*;

@Entity
public class AvecTablePremiere {
    @TableGenerator(name = "tableAT",table = "TABLEAT",pkColumnName = "PKCOL",pkColumnValue = "PREMIERE")
    @Id @GeneratedValue(strategy = GenerationType.TABLE,generator = "tableAT")
    private int key;

    public int getKey() {
        return key;
    }
}
