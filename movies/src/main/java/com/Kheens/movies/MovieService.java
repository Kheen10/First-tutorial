package com.Kheens.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<movie> allMovies(){
        return movieRepository.findAll();
    }
    public Optional<movie> singleMovie(String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }

}
