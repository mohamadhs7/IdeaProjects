import javax.persistence.*;
@Entity
public class Actor {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToOne (cascade = CascadeType.ALL)
    private Movie movie;

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

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
