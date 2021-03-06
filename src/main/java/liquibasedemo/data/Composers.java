package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Composers generated by hbm2java
 */
@Entity
@Table(name = "composers", schema = "public")
public class Composers implements java.io.Serializable {

    private int composerid;
    private String name;

    public Composers() {
    }

    public Composers(int composerid, String name) {
        this.composerid = composerid;
        this.name = name;
    }

    @Id
    @Column(name = "composerid", unique = true, nullable = false)
    public int getComposerid() {
        return this.composerid;
    }

    public void setComposerid(int composerid) {
        this.composerid = composerid;
    }

    @Column(name = "name", nullable = false, length = 250)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
