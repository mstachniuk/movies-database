package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Movies2producersId generated by hbm2java
 */
@Embeddable
public class Movies2producersId implements java.io.Serializable {

    private int movieid;
    private int producerid;
    private String addition;

    public Movies2producersId() {
    }

    public Movies2producersId(int movieid, int producerid) {
        this.movieid = movieid;
        this.producerid = producerid;
    }

    public Movies2producersId(int movieid, int producerid, String addition) {
        this.movieid = movieid;
        this.producerid = producerid;
        this.addition = addition;
    }

    @Column(name = "movieid", nullable = false)
    public int getMovieid() {
        return this.movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    @Column(name = "producerid", nullable = false)
    public int getProducerid() {
        return this.producerid;
    }

    public void setProducerid(int producerid) {
        this.producerid = producerid;
    }

    @Column(name = "addition", length = 1000)
    public String getAddition() {
        return this.addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof Movies2producersId))
            return false;
        Movies2producersId castOther = (Movies2producersId) other;

        return (this.getMovieid() == castOther.getMovieid())
                && (this.getProducerid() == castOther.getProducerid())
                && ((this.getAddition() == castOther.getAddition()) || (this.getAddition() != null
                && castOther.getAddition() != null && this.getAddition().equals(castOther.getAddition())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getMovieid();
        result = 37 * result + this.getProducerid();
        result = 37 * result + (getAddition() == null ? 0 : this.getAddition().hashCode());
        return result;
    }

}