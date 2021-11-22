import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MemberType {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @OneToMany(mappedBy = "mmbt")
    private List<Member> Members = new ArrayList<Member>();

    public List<Member> getMembers() {
        return Members;
    }

    public void setMembers(List<Member> Members) {
        this.Members = Members;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
