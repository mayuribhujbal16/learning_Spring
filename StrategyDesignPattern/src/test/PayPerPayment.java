package test;

public class PayPerPayment implements PaymentStrategy 
{
	@Override
	public void pay(int ammount)
	{
		System.out.println("PayPerPayment paid: " +ammount+ " rs ");
	}

}
