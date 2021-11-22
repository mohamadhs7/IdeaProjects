import javax.persistence.*;
@Entity
public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private PassportDetail passportDetail;

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
    public PassportDetail getPassportDetail() {
        return passportDetail;
    }
    public void setPassportDetail(PassportDetail passportDetail) {
        this.passportDetail = passportDetail;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passportDetail=" + passportDetail.getPassportNo() +
                '}';
    }
}