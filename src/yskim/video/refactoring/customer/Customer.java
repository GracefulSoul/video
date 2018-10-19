package yskim.video.refactoring.customer;

import java.util.ArrayList;
import java.util.List;

import yskim.video.refactoring.calcurate.Calculator;
import yskim.video.refactoring.rental.Rental;

public class Customer {
    
    private String name;
    private List<Rental> rentals = new ArrayList<>();
    
    public Customer(String name) {
        this.name = name;
    };
    
    public void addRental(Rental rental) {
        rentals.add(rental);
    }
    
    public String getName() {
        return name;
    };
    
    public String statement() {
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");
        return result.append(new Calculator().getStatement(rentals)).toString();
    }
    
}