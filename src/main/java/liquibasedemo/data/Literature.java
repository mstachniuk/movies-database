package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;

/**
 * Literature generated by hbm2java
 */
@Entity
@Table(name = "literature", schema = "public")
public class Literature implements java.io.Serializable {

    private LiteratureId id;

    public Literature() {
    }

    public Literature(LiteratureId id) {
        this.id = id;
    }

    @EmbeddedId
    @AttributeOverrides({@AttributeOverride(name = "movieid", column = @Column(name = "movieid", nullable = false)),
            @AttributeOverride(name = "literaturetext", column = @Column(name = "literaturetext"))})
    public LiteratureId getId() {
        return this.id;
    }

    public void setId(LiteratureId id) {
        this.id = id;
    }

}
