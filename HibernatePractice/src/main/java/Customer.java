import org.hibernate.annotations.Type;
import org.hibernate.type.BigDecimalType;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "customer")
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "cust_code")
    private long id;
    @Column(name = "cust_name")
    private String name;
    @Column(name = "cust_city")
    private String city;
    @Column(name = "working_area")
    private String workingArea;
    @Column(name = "cust_country")
    private String country;
    @Column(name = "grade")
    private BigDecimal grade;
   @Column(scale = 2,precision = 12,name = "payment_amount")
    private BigDecimal paymentAmount;


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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWorkingArea() {
        return workingArea;
    }

    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", workingArea='" + workingArea + '\'' +
                ", country='" + country + '\'' +
                ", grade=" + grade +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
}
