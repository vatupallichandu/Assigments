package comm;

public class OrderThread extends Thread {
	private Inventary inventary;
	private Payment payment;
	private String user;
	private int qty;
	public OrderThread(Inventary inventary,Payment payment,String user,int qty)
	{
		this.inventary=inventary;
		this.payment=payment;
		this.user=user;
		this.qty=qty;
	}
	public void run()
	{
		 boolean success=inventary.purchase(user,qty);
		if(success){
			payment.makePayment(user, qty*100);
			
		}
		else {
			System.out.println(user+"payment failed due to purchase failure");
		}
	}
	public static void main(String[] args) {
		Inventary inv=new Inventary();
		Payment pay=new Payment();
		OrderThread th1=new OrderThread(inv,pay,"nandu",67);
		OrderThread th2=new OrderThread(inv,pay,"chandu",12);
		
		th1.start();
		th2.start();
	}
	

}
