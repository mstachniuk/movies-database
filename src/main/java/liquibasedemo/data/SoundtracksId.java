package liquibasedemo.data;

// Generated 2015-05-04 22:44:44 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SoundtracksId generated by hbm2java
 */
@Embeddable
public class SoundtracksId implements java.io.Serializable {

    private int movieid;
    private String soundtracktext;

    public SoundtracksId() {
    }

    public SoundtracksId(int movieid) {
        this.movieid = movieid;
    }

    public SoundtracksId(int movieid, String soundtracktext) {
        this.movieid = movieid;
        this.soundtracktext = soundtracktext;
    }

    @Column(name = "movieid", nullable = false)
    public int getMovieid() {
        return this.movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    @Column(name = "soundtracktext")
    public String getSoundtracktext() {
        return this.soundtracktext;
    }

    public void setSoundtracktext(String soundtracktext) {
        this.soundtracktext = soundtracktext;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof SoundtracksId))
            return false;
        SoundtracksId castOther = (SoundtracksId) other;

        return (this.getMovieid() == castOther.getMovieid())
                && ((this.getSoundtracktext() == castOther.getSoundtracktext()) || (this.getSoundtracktext() != null
                && castOther.getSoundtracktext() != null && this
                .getSoundtracktext()
                .equals(castOther.getSoundtracktext())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getMovieid();
        result = 37 * result + (getSoundtracktext() == null ? 0 : this.getSoundtracktext().hashCode());
        return result;
    }

}
