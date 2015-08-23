package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;

/**
 * Ratings generated by hbm2java
 */
@Entity
@Table(name = "ratings", schema = "public")
public class Ratings implements java.io.Serializable {

    private RatingsId id;

    public Ratings() {
    }

    public Ratings(RatingsId id) {
        this.id = id;
    }

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "movieid", column = @Column(name = "movieid", nullable = false)),
            @AttributeOverride(name = "rank", column = @Column(name = "rank", nullable = false, length = 4)),
            @AttributeOverride(name = "votes", column = @Column(name = "votes")),
            @AttributeOverride(name = "distribution", column = @Column(name = "distribution", nullable = false, length = 10))})
    public RatingsId getId() {
        return this.id;
    }

    public void setId(RatingsId id) {
        this.id = id;
    }

}