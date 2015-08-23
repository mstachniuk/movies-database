package liquibasedemo.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "movies2actors", schema = "public")
//@IdClass(RoleId.class)
public class Role implements Serializable {

    @EmbeddedId
    private RoleId roleId = new RoleId();

    @Column(name = "as_character")
    private String character;

    @JsonIgnore
    public Movie getMovie() {
        return roleId.getMovie();
    }

    public void setMovie(Movie movie) {
        this.roleId.setMovie(movie);
    }

    public Actor getActor() {
        return roleId.getActor();
    }

    public void setActor(Actor actor) {
        this.roleId.setActor(actor);
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
