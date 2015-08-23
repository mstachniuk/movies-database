package liquibasedemo.data;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies", schema = "public")
public class Movie implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movieid", unique = true, nullable = false)
    private Integer movieid;

    @Column(name = "title", nullable = false, length = 400)
    private String title;

    @Column(name = "year", length = 100)
    private String year;

    @Column(name = "imdbid", length = 10)
    private String imdbid;

    @OneToMany(mappedBy = "roleId.movie", orphanRemoval = true,
            fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Role> roles;

    public Movie() {
    }

    public Movie(int movieid, String title) {
        this.movieid = movieid;
        this.title = title;
    }

    public Movie(int movieid, String title, String year, String imdbid) {
        this.movieid = movieid;
        this.title = title;
        this.year = year;
        this.imdbid = imdbid;
    }

    public Integer getMovieid() {
        return this.movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImdbid() {
        return this.imdbid;
    }

    public void setImdbid(String imdbid) {
        this.imdbid = imdbid;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void addRole(Role role) {
        if (roles == null) {
            roles = new ArrayList<>();
        }
        roles.add(role);
    }
}
