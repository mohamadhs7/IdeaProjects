import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestTable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String column1;
    private Boolean column2;
    private double column3;

    public TestTable(String column1, Boolean column2, double column3) {
        this.column1 = column1;
        this.column2 = column2;
        this.column3 = column3;
    }

    public TestTable() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public Boolean getColumn2() {
        return column2;
    }

    public void setColumn2(Boolean column2) {
        this.column2 = column2;
    }

    public double getColumn3() {
        return column3;
    }

    public void setColumn3(double column3) {
        this.column3 = column3;
    }
}
