package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ColorinfoId generated by hbm2java
 */
@Embeddable
public class ColorinfoId implements java.io.Serializable {

    private int movieid;
    private String color;
    private String addition;

    public ColorinfoId() {
    }

    public ColorinfoId(int movieid, String color) {
        this.movieid = movieid;
        this.color = color;
    }

    public ColorinfoId(int movieid, String color, String addition) {
        this.movieid = movieid;
        this.color = color;
        this.addition = addition;
    }

    @Column(name = "movieid", nullable = false)
    public int getMovieid() {
        return this.movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    @Column(name = "color", nullable = false)
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Column(name = "addition")
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
        if (!(other instanceof ColorinfoId))
            return false;
        ColorinfoId castOther = (ColorinfoId) other;

        return (this.getMovieid() == castOther.getMovieid())
                && ((this.getColor() == castOther.getColor()) || (this.getColor() != null
                && castOther.getColor() != null && this.getColor().equals(castOther.getColor())))
                && ((this.getAddition() == castOther.getAddition()) || (this.getAddition() != null
                && castOther.getAddition() != null && this.getAddition().equals(castOther.getAddition())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getMovieid();
        result = 37 * result + (getColor() == null ? 0 : this.getColor().hashCode());
        result = 37 * result + (getAddition() == null ? 0 : this.getAddition().hashCode());
        return result;
    }

}
