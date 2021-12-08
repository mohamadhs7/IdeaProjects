import javax.persistence.*;

@Entity
//@Table(name = "employee")
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    //    @SequenceGenerator()
 //   @Column(name = "id")
    private long id;
   // @Column(name = "name")
    private String Name;
    //@Column(name = "lastname")
    private String LastName;
    //@Column(name = "marriage")
    private Boolean Marriage;
    //@Column(name = "salary")
    private double Salary;
    private String District;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Boolean getMarriage() {
        return Marriage;
    }

    public void setMarriage(Boolean marriage) {
        Marriage = marriage;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }
}
