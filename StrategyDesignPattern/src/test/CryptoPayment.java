package test;

public class CryptoPayment implements PaymentStrategy
{
	@Override
	public void pay(int ammount)
	{
		System.out.println("CryptoPayment paid: " +ammount+ " rs ");
	}

}
