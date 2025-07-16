package day10;

import java.util.Stack;

public class BrowserHistory {
	Stack<String>backStack=new Stack<>();
	Stack<String>forwardStack=new Stack();
	String currentPage="home";
	public void visit(String url)
	{
		backStack.push(currentPage); 
		currentPage=url;
		forwardStack.clear();
		System.out.println("currenetpage"+currentPage);
	}
	public void back()
	{
		if(!backStack.isEmpty()) {
			forwardStack.push(currentPage);
			currentPage=backStack.pop();
			System.out.println("went back to "+currentPage);
			
		}
		
	}
	
	

	public void forward()
	{
		if(!forwardStack.isEmpty())
		{
			backStack.push(currentPage);
			currentPage=forwardStack.pop();
			System.out.println("went to "+currentPage);
		}
		
	}
	public void currentPage()
	{
		System.out.println("current page"+currentPage);
		
	}
	public static void main(String[] args) {
		BrowserHistory history=new BrowserHistory();
		history.visit("google.com");
		history.visit("openai.com");
		history.visit("github.com");
		
		history.back();
		history.back();
		history.back();
		
		history.forward();
		history.visit("stackoverflow.com");
		history.currentPage();
		
	}
	

}
