package com.cursor.streamPractice.movies;

public class Movie {
    private int price;
    private Genre genre;

    Movie(int price, Genre genre) {
        this.price = price;
        this.genre = genre;
    }

    int getPrice() {
        return price;
    }

    Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return getGenre() + " movie costs +" + getPrice();
    }
}
