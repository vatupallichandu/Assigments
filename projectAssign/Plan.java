package com.projectAssign;

public interface Plan {
	double getRatePerMinute();
	}
	 
	class PrepaidPlan implements Plan {
	    public double getRatePerMinute() {
	        return 1.0;
	    }
	}
	 
	class PostpaidPlan implements Plan {
	    public double getRatePerMinute() {
	        return 0.5;
	    }

}
