package liquibasedemo.service;

import liquibasedemo.Application;
import liquibasedemo.data.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@ActiveProfiles("test")
public class MovieServiceTest {

    @Autowired
    private MovieService movieService;

    @Autowired
    private ActorService actorService;

    @Autowired
    private DataSource dataSource;

    @Before
    public void before() throws SQLException {
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void shouldStoreMovieAndFindItByName() {
        // given
        Movie movie = new Movie();
        movie.setTitle("Miś");

        // when
        movieService.save(movie);
        List<Movie> actual = movieService.findByTitle("Miś");

        // then
        Movie expectedMovie = new Movie();
        expectedMovie.setTitle("Miś");
        assertThat(actual)
                .usingElementComparator(new Comparator<Movie>() {
                    @Override
                    public int compare(Movie o1, Movie o2) {
                        return o1.getTitle().compareTo(o2.getTitle());
                    }
                })
                .containsOnly(expectedMovie);
        assertThat(actual.get(0).getMovieid())
                .isNotNull();
    }

    @Test
    public void shouldStoreMovieWithActors() {
        // given
        Actor methodMan = ActorBuilder.newActor()
                .name("Method Man")
                .sex(ActorBuilder.Sex.MALE)
                .build();
        Actor redMan = ActorBuilder.newActor()
                .name("Redman")
                .sex(ActorBuilder.Sex.MALE)
                .build();
        actorService.save(methodMan);
        actorService.save(redMan);

        Movie howHigh = MovieBuilder.newMovie()
                .title("How High")
                .year(2001)
                .imdbid("tt0278488")
                .addActor("Silas P. Silas", methodMan)
                .addActor("Jamal King", redMan)
                .build();

        // when
        movieService.save(howHigh);
        List<Movie> actual = movieService.findByTitle("How High");

        // then
        assertThat(actual.size())
                .isEqualTo(1);
        Movie actualMovie = actual.get(0);
        assertThat(actualMovie.getTitle()).isEqualTo("How High");
        assertThat(actualMovie.getYear()).isEqualTo("2001");
        assertThat(actualMovie.getImdbid()).isEqualTo("tt0278488");
        assertThat(actualMovie.getRoles()).hasSize(2);
        assertThat(actualMovie.getMovieid()).isNotNull();

        Role role1 = actualMovie.getRoles().stream()
                .filter(r -> r.getCharacter().equals("Silas P. Silas"))
                .findFirst()
                .get();
        assertThat(role1.getMovie().getTitle()).isEqualTo("How High");
        assertThat(role1.getActor().getName()).isEqualTo("Method Man");
        assertThat(role1.getActor().getSex()).isEqualTo('M');

        Role role2 = actualMovie.getRoles().stream()
                .filter(r -> r.getCharacter().equals("Jamal King"))
                .findFirst()
                .get();
        assertThat(role2.getMovie().getTitle()).isEqualTo("How High");
        assertThat(role2.getActor().getName()).isEqualTo("Redman");
        assertThat(role2.getActor().getSex()).isEqualTo('M');
    }

    @Test
    public void shouldStoreActorOnceWhenActorPlayInTwoMovies() {
        // given
        Actor keanuReeves = ActorBuilder.newActor()
                .name("Keanu Reeves")
                .sex(ActorBuilder.Sex.MALE)
                .build();
        actorService.save(keanuReeves);

        Movie matrix = MovieBuilder.newMovie()
                .title("Matrix")
                .year(1999)
                .imdbid("tt0133093")
                .addActor("Neo", keanuReeves)
                .build();
        Movie matrix2 = MovieBuilder.newMovie()
                .title("The Matrix Reloaded")
                .year(1999)
                .imdbid("tt0234215")
                .addActor("Neo", keanuReeves)
                .build();

        movieService.save(matrix);
        movieService.save(matrix2);

        // when
        List<Movie> actual = movieService.findByTitle("Matrix");
        List<Movie> actual2 = movieService.findByTitle("The Matrix Reloaded");


        // then
        assertThat(actual.get(0).getRoles().get(0).getActor()).isEqualTo(actual2.get(0).getRoles().get(0).getActor());
    }
}