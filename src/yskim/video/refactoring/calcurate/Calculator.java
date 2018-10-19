package yskim.video.refactoring.calcurate;

import java.util.List;

import yskim.video.refactoring.rental.Rental;

public class Calculator {
    
    private StringBuilder result = new StringBuilder();
    
    public StringBuilder getStatement(List<Rental> rentals) {
        double totalAmount = 0d;
        int frequentRentalPoints = 0;
        
        for ( Rental rental : rentals ) {
            totalAmount += rental.getAmount();
            frequentRentalPoints += rental.getPoint();
            result.append(this.getResult(rental));
        }
        
        return result.append(this.getTotResult(totalAmount, frequentRentalPoints));
    }
    
    private String getResult(Rental rental) {
        return "\t" +  rental.getAmount() + "(" + rental.getMovie().getTitle() + ")" + "\n";
    }
    
    private String getTotResult(double totalAmount, int frequentRenterPoints) {
        return "Amount owed is " + totalAmount + "\n" + "You earned "
             + frequentRenterPoints + " frequent renter pointers";
    }
    
}
