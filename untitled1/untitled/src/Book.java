import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name="selectall",query = "from Book"),
        @NamedQuery(name="update_title",query = "update Book set title=:titlevalue where id=:idvalue")
 })
@NamedNativeQuery(name="selectalll",query = "select * from book")
public class Book {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    @ManyToOne
    private BookCategory bc;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
//                ", bc=" + bc.getBookCategory() +
                '}';
    }
//
//    public BookCategory getBc() {
//        return bc;
//    }
//
//    public void setBc(BookCategory bc) {
//        this.bc = bc;
//    }

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
