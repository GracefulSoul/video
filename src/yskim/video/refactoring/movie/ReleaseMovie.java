package yskim.video.refactoring.movie;

public class ReleaseMovie extends Movie {
    
    public ReleaseMovie(String title) {
        super(title, Movie.NEW_RELEASE);
    }
    
    @Override
    public double calculateAmount(int daysRented) {
        return daysRented * 3d;
    }
    
    @Override
    public int calculateRetalPoint(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
    
}