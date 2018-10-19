package yskim.video.orignal;

public class Main {
    
    public static void main(String[] args) {
        Movie movie1 = new Movie("asdf", Movie.CHILDRENS);
        Movie movie2 = new Movie("qwer", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("zxcv", Movie.REGULAR);
        Movie movie4 = new Movie("1234", 3);
        movie4.setPriceCode(5);
        
        Rental rental1 = new Rental(movie1, 5);
        Rental rental2 = new Rental(movie2, 4);
        Rental rental3 = new Rental(movie3, 3);
        Rental rental4 = new Rental(movie4, 7);
        
        Customer customer = new Customer("Boy");
        customer.addRental(rental1);
        System.out.println(customer.statement());
        
        customer.addRental(rental2);
        customer.addRental(rental3);
        customer.addRental(rental4);
        System.out.println(customer.statement());
    }
    
}
