package yskim.video.refactoring.movie;

public class RegularMovie extends Movie {
    
    public RegularMovie(String title) {
        super(title, Movie.REGULAR);
    }
    
    @Override
    public double calculateAmount(int daysRented) {
        double thisAmount = 2;
        return daysRented > 2 ? thisAmount + ((daysRented - 2) * 1.5) : thisAmount;
    }
    
    @Override
    public int calculateRetalPoint(int daysRented) {
        return 1;
    }
    
}