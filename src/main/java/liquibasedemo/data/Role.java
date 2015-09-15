package liquibasedemo.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.builder.ToStringBuilder;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (character != null ? !character.equals(role.character) : role.character != null) return false;
        if (roleId != null ? !roleId.equals(role.roleId) : role.roleId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId != null ? roleId.hashCode() : 0;
        result = 31 * result + (character != null ? character.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("roleId", roleId)
                .append("character", character)
                .toString();
    }
}
