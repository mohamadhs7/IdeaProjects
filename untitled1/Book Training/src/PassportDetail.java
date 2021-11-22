import javax.persistence.*;
@Entity
public class PassportDetail {
    @Id
    @GeneratedValue
    private long id;
    private String passportNo;
    @OneToOne(mappedBy = "passportDetail",cascade = CascadeType.ALL)
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getPassportNo() {
        return passportNo;
    }
    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    @Override
    public String toString() {
        return "PassportDetail{" +
                "id=" + id +
                ", passportNo='" + passportNo + '\'' +
//                ", person=" + person.getName() +
                '}';
    }
}