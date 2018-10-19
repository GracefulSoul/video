package yskim.video.refactoring;

import yskim.video.refactoring.customer.Customer;
import yskim.video.refactoring.movie.ChildrensMovie;
import yskim.video.refactoring.movie.Movie;
import yskim.video.refactoring.movie.RegularMovie;
import yskim.video.refactoring.movie.ReleaseMovie;
import yskim.video.refactoring.rental.Rental;

public class Main {
    
    public static void main(String[] args) {
        Movie movie1 = new RegularMovie("asdf");
        Movie movie2 = new ReleaseMovie("qwer");
        Movie movie3 = new ChildrensMovie("zxcv");
        
        Rental rental1 = new Rental(movie1, 5);
        Rental rental2 = new Rental(movie2, 2);
        Rental rental3 = new Rental(movie3, 3);
        
        Customer customer = new Customer("Boy");
        customer.addRental(rental1);
        System.out.println(customer.statement());
        
        customer.addRental(rental2);
        customer.addRental(rental3);
        System.out.println(customer.statement());
    }
    
}
