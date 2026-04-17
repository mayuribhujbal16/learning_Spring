package test;

public class ShoppingCart  
{
	private PaymentStrategy paymentStrategy = null;
	
/*	//setter injection
	public void setPaymentStrategy(PaymentStrategy paymentStrategy)
	{
		this.paymentStrategy = paymentStrategy;
	}
*/	
	//constructor injection
	public ShoppingCart(PaymentStrategy paymentStrategy)
	{
		this.paymentStrategy = paymentStrategy;
	}
	public void checkout(int amount)
	{
		paymentStrategy.pay(amount);  
	}
	

}
