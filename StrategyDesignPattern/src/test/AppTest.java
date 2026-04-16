package test;

public class AppTest {

	public static void main(String[] args) 
	{
		ShoppingCart cart = new ShoppingCart(new PayPerPayment());
		
		//pay using creditcard 
	   //cart.setPaymentStrategy(new CreditCardPayment());
		cart.checkout(100); 

	}

}
