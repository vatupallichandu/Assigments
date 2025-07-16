package day8;

public class ProducerThread extends Thread {
	private ProducerConsumerProblemDemo pc;

	/**
	 * @param prod1
	 */
	public ProducerThread( ProducerConsumerProblemDemo pc) {
		this.pc = pc;
	}
	public void run() {
		int value=0;
		try {
		while(true) {
			pc.produce(value++);
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
			
		}
		
	}
	
	

}
