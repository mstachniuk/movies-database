package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;

/**
 * Movies2directors generated by hbm2java
 */
@Entity
@Table(name = "movies2directors", schema = "public")
public class Movies2directors implements java.io.Serializable {

    private Movies2directorsId id;

    public Movies2directors() {
    }

    public Movies2directors(Movies2directorsId id) {
        this.id = id;
    }

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "movieid", column = @Column(name = "movieid", nullable = false)),
            @AttributeOverride(name = "directorid", column = @Column(name = "directorid", nullable = false)),
            @AttributeOverride(name = "addition", column = @Column(name = "addition", length = 1000))})
    public Movies2directorsId getId() {
        return this.id;
    }

    public void setId(Movies2directorsId id) {
        this.id = id;
    }

}
