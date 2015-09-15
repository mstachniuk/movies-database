package liquibasedemo.data;


import org.apache.commons.lang3.builder.ToStringBuilder;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (imdbid != null ? !imdbid.equals(movie.imdbid) : movie.imdbid != null) return false;
        if (roles != null ? !roles.equals(movie.roles) : movie.roles != null) return false;
        if (title != null ? !title.equals(movie.title) : movie.title != null) return false;
        if (year != null ? !year.equals(movie.year) : movie.year != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (imdbid != null ? imdbid.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("movieid", movieid)
                .append("title", title)
                .append("year", year)
                .append("imdbid", imdbid)
                .append("roles", roles)
                .toString();
    }
}
