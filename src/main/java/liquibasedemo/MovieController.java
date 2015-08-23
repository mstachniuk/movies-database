package liquibasedemo;

import liquibasedemo.data.Movie;
import liquibasedemo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService service;

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    @ResponseBody
    public List<Movie> getAllMovies() {
        return service.findAll();
    }
}
