import javax.persistence.*;

@Entity
public class Degree {
    @Id
    @GeneratedValue
    private long id;
    private String degreeName;
    private int passingYear;

    @ManyToOne
    private Employee employee;
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Degree() {
    }

    public Degree(String degreeName, int passingYear) {
        this.degreeName = degreeName;
        this.passingYear = passingYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public int getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(int passingYear) {
        this.passingYear = passingYear;
    }

    @Override
    public String toString() {
        return "Degree{" +
                "id=" + id +
                ", degreeName='" + degreeName + '\'' +
                ", passingYear=" + passingYear +
                '}';
    }
}