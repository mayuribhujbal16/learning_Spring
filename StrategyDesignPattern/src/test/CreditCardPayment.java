package test;

public class CreditCardPayment implements PaymentStrategy
{
	@Override
	public void pay(int ammount)
	{
		System.out.println("CreditCardPayment paid: " +ammount+ " rs ");
	}
}
