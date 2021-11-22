import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.*;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class Member
{
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String family;

//    @OneToMany(cascade =CascadeType.ALL,mappedBy = "member",fetch = FetchType.LAZY)
//    private List<Address> addresses=new ArrayList<Address>();
//
//    public List<Address> getAddresses() {
//        return addresses;
//    }
//
//    public void setAddresses(List<Address> addresses) {
//        this.addresses = addresses;
//    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }

    //    @OneToOne(cascade = CascadeType.ALL)
//    private Address adss;
    @ManyToOne(cascade = CascadeType.ALL)
    private MemberType mmbt;

    public MemberType getMmbt() {
        return mmbt;
    }

    public void setMmbt(MemberType mmbt) {
        this.mmbt = mmbt;
    }
//
//    public Address getAdss() {
//        return adss;
//    }
//
//    public void setAdss(Address adss) {
//        this.adss = adss;
//    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }


}
