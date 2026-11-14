abstract class Payment {
    abstract void pay(double amount) ;
}

class UPI extends Payment {
    @Override
    void pay(double amount){
        System.out.println("Paid Rs " + amount + " using UPI") ;
    }
}

class Card extends Payment {
    @Override
    void pay(double amount){
        System.out.println("Paid Rs " + amount + " using Card") ;
    }
}

public class Abstract_payment {
    public static void main(String[] args) {
        UPI upi = new UPI() ;
        upi.pay(100.0) ;

        Card card = new Card() ;
        card.pay(200.0) ;

        Payment payment1 = new UPI() ; // both works
        payment1.pay(300.0) ;

        Payment payment2 = new Card() ; // both works
        payment2.pay(400.0) ;

    }
}
