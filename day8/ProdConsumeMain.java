package day8;

public class ProdConsumeMain {
	public static void main(String[] args) {
		ProducerConsumerProblemDemo prod1 = new ProducerConsumerProblemDemo();
		new ProducerThread(prod1).start();
		new ConsumerThread(prod1).start();
	}
 
}