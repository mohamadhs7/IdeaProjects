import javax.persistence.*;

@Entity
//@AttributeOverrides({
//        @AttributeOverride(name="id", column = @Column(name="id")),
//        @AttributeOverride(name="name", column = @Column(name="name")),
//        @AttributeOverride(name="base_salary", column = @Column(name="base_salary"))
//})
//@DiscriminatorValue(value="P")
public class Programmer extends Employee
{
    private String skills;
    private int programmer_bonus;

    public String getSkills() {
        return skills;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public int getProgrammer_bonus() {
        return programmer_bonus;
    }
    public void setProgrammer_bonus(int programmer_bonus) {
        this.programmer_bonus = programmer_bonus;
    }


}
