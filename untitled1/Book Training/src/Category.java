import javax.persistence.*;
import java.util.Date;

@Entity
//@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
  //  @Column(name = "id")
    private long id;
    //@Column(name = "name")
    private String name;
    //@Column(name = "created_on")
    private Date createdOn;
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
    public Date getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}