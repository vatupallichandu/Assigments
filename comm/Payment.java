package comm;

public class Payment {
	public synchronized void makePayment(String user,int amount)
	{
		System.out.println(user+"made of payment"+amount);
	}

}
