package dev.Manoj.Movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movierepo;
    public List<Movie> allmovies(){
     return movierepo.findAll();
    }
    public Optional<Movie> singleMovie(String imdbId){
        return movierepo.findMovieByImdbId(imdbId);
    }
}
