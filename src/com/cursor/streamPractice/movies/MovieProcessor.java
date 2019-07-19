package com.cursor.streamPractice.movies;

import java.util.*;
import java.util.stream.Collectors;

public class MovieProcessor {
    private static final int MAX_PRICE = 501;
    private List<Movie> moviesList;

    public MovieProcessor(int moviesNumber){
        moviesList = generateMovieList(moviesNumber);
    }

    public Map<Genre, Long> calculateMoviesByGenre(){

        return moviesList.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
    }
    public Map<Genre, Double> calculateAveragePriceByGenre(){
        Map<Genre, Double> result = new HashMap<>();
        for (Genre genre : Genre.values()){
            double averagePrice  = moviesList.stream()
                    .filter(movie ->movie.getGenre().equals(genre))
                    .mapToInt(Movie::getPrice)
                    .average()
                    .orElse(0);
            result.put(genre, averagePrice);
        }
        return result;
    }

    private List<Movie> generateMovieList(int moviesNumber){
        List<Movie> result = new ArrayList<>();
        List<Genre> genresList = Arrays.asList(Genre.values());
        Random random = new Random();
        for (int i = 0; i < moviesNumber; i++){
            int price = random.nextInt(MAX_PRICE);
            int genre = random.nextInt(genresList.size());
            result.add(new Movie(price, genresList.get(genre)));
        }
        return result;
    }



}
