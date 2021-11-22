import javax.persistence.*;
import java.util.*;
@Entity
@Table
public class Department{
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    @ManyToOne
    @JoinColumn
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}