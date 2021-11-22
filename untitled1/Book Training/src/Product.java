
import javax.persistence.*;

@Entity
//@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
//    @Column(name = "id")
    private long id;
  //  @Column(name = "name")
    private String name;
    //@Column(name = "price")
    private double price;
    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "category_id")
    private Category category;
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
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}