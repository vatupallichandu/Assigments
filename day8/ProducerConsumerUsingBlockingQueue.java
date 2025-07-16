package day8;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingBlockingQueue {
	public static void main(String[] args) {
		BlockingQueue<Integer>data=new ArrayBlockingQueue(5);
		Runnable producer =()->{
			int value=0;
			try {
				while(true)
				{
					data.put(value);
					System.out.println("Produce"+value);
					value++;
					
				}
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		};
		Runnable consumer =()->{
			
			try {
				while(true)
				{
					int value=data.take();
					
					System.out.println("consume"+value);
					
				}
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		};
		new Thread(consumer).start();
		new Thread(producer).start();
		
	}

}
