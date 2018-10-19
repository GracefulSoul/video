package yskim.video.refactoring.movie;

public class ChildrensMovie extends Movie {
    
    public ChildrensMovie(String title) {
        super(title, Movie.CHILDRENS);
    }
    
    @Override
    public double calculateAmount(int daysRented) {
        double thisAmount = 1.5;
        return daysRented > 3 ? thisAmount + ((daysRented -3) * 1.5) : thisAmount;
    }
    
    @Override
    public int calculateRetalPoint(int daysRented) {
        return 1;
    }
    
}