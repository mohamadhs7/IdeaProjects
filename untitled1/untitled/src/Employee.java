import com.sun.istack.Nullable;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="emp_type"
//        , discriminatorType= DiscriminatorType.STRING
//        , length=2
//)
//@DiscriminatorValue(value="E")
@Audited
public class Employee
{
    @Id @GeneratedValue(strategy=GenerationType.TABLE)
    private Integer id;
    private String name;
    private int base_salary;
    @Version
    private long version;
    @NotAudited
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBase_salary() {
        return base_salary;
    }
    public void setBase_salary(int base_salary) {
        this.base_salary = base_salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
