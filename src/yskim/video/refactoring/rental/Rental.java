package yskim.video.refactoring.rental;

import yskim.video.refactoring.movie.Movie;

public class Rental {
    
    private Movie movie;
    private int daysRented;
    
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return daysRented;
    }
    
    public Movie getMovie() {
        return movie;
    }
    
    public double getAmount() {
        return movie.calculateAmount(this.daysRented);
    }
    
    public int getPoint() {
        return movie.calculateRetalPoint(this.daysRented);
    }
    
}