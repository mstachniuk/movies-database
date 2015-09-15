package liquibasedemo.data;

import java.util.ArrayList;
import java.util.List;

public class MovieBuilder {

    private String title;
    private Integer year;
    private String imdbid;
    private List<RoleBuilder> roles = new ArrayList<>();

    public static MovieBuilder newMovie() {
        return new MovieBuilder();
    }

    private MovieBuilder() {
    }

    public MovieBuilder title(String title) {
        this.title = title;
        return this;
    }

    public MovieBuilder year(Integer year) {
        this.year = year;
        return this;
    }

    public MovieBuilder imdbid(String imdbid) {
        this.imdbid = imdbid;
        return this;
    }

    public MovieBuilder addActor(String character, Actor actor) {
        RoleBuilder roleBuilder = RoleBuilder.newRole()
                .character(character)
                .actor(actor);
        roles.add(roleBuilder);
        return this;
    }

    public Movie build() {
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setYear(year.toString());
        movie.setImdbid(imdbid);
        for (RoleBuilder role : roles) {
            Role role1 = role.build();
            role1.setMovie(movie);
            movie.addRole(role1);
        }
        return movie;
    }
}
