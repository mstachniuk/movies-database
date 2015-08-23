package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MovielinksId generated by hbm2java
 */
@Embeddable
public class MovielinksId implements java.io.Serializable {

    private int movieid;
    private String movielinkstext;

    public MovielinksId() {
    }

    public MovielinksId(int movieid) {
        this.movieid = movieid;
    }

    public MovielinksId(int movieid, String movielinkstext) {
        this.movieid = movieid;
        this.movielinkstext = movielinkstext;
    }

    @Column(name = "movieid", nullable = false)
    public int getMovieid() {
        return this.movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    @Column(name = "movielinkstext")
    public String getMovielinkstext() {
        return this.movielinkstext;
    }

    public void setMovielinkstext(String movielinkstext) {
        this.movielinkstext = movielinkstext;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof MovielinksId))
            return false;
        MovielinksId castOther = (MovielinksId) other;

        return (this.getMovieid() == castOther.getMovieid())
                && ((this.getMovielinkstext() == castOther.getMovielinkstext()) || (this.getMovielinkstext() != null
                && castOther.getMovielinkstext() != null && this
                .getMovielinkstext()
                .equals(castOther.getMovielinkstext())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getMovieid();
        result = 37 * result + (getMovielinkstext() == null ? 0 : this.getMovielinkstext().hashCode());
        return result;
    }

}