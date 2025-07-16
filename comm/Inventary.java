package comm;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
 
public class Inventary {
    private int stock = 100;
    private Lock lock = new ReentrantLock();
    public boolean purchase(String user,int qty) {
    	lock.lock();
    	try {
    		if(stock>=qty)
    		{
    			System.out.println(user+"purchased"+qty+"items");
    			stock -=qty;
    			System.out.println(stock);
    			return true;
    		}
    		else {
    			System.out.println("unpurchased item");
    			return false;
    		}
    	}
    	finally
    	{
    		lock.unlock();
    	}
	
    }
    public int getStock()
    {
    	return stock;
    }

	
}
 
 
    
 
