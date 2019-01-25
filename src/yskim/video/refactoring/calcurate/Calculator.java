package yskim.video.refactoring.calcurate;

import java.util.List;

import yskim.video.refactoring.rental.Rental;

public class Calculator {
    
    private StringBuilder result = new StringBuilder();
    private double totalAmount = 0d;
    private int frequentRentalPoints = 0;
    
    public StringBuilder getStatement(List<Rental> rentals) {
        for ( Rental rental : rentals ) {
            totalAmount += rental.getAmount();
            frequentRentalPoints += rental.getPoint();
            result.append(this.getResult(rental));
        }
        return result.append(this.getTotResult(totalAmount, frequentRentalPoints));
    }
    
    private String getResult(Rental rental) {
        return new StringBuilder().append("\t")
                                  .append(rental.getAmount())
                                  .append("(")
                                  .append(rental.getMovie().getTitle())
                                  .append(")\n")
                                  .toString();
    }
    
    private String getTotResult(double totalAmount, int frequentRenterPoints) {
        return new StringBuilder().append("Amount owed is ")
                                  .append(totalAmount)
                                  .append("\n")
                                  .append("You earned ")
                                  .append(frequentRenterPoints)
                                  .append(" frequent renter pointers")
                                  .toString();
    }
    
}
