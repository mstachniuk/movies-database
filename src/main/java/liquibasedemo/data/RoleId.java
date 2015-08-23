package liquibasedemo.data;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class RoleId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "movieid")
    private Movie movie;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "actorid")
    private Actor actor;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleId roleId = (RoleId) o;

        if (actor != null ? !actor.equals(roleId.actor) : roleId.actor != null) return false;
        if (movie != null ? !movie.equals(roleId.movie) : roleId.movie != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = movie != null ? movie.hashCode() : 0;
        result = 31 * result + (actor != null ? actor.hashCode() : 0);
        return result;
    }
}
