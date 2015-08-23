package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Producers generated by hbm2java
 */
@Entity
@Table(name = "producers", schema = "public")
public class Producers implements java.io.Serializable {

    private int producerid;
    private String name;

    public Producers() {
    }

    public Producers(int producerid, String name) {
        this.producerid = producerid;
        this.name = name;
    }

    @Id
    @Column(name = "producerid", unique = true, nullable = false)
    public int getProducerid() {
        return this.producerid;
    }

    public void setProducerid(int producerid) {
        this.producerid = producerid;
    }

    @Column(name = "name", nullable = false, length = 250)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}