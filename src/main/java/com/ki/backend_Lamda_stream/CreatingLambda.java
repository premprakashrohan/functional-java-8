package com.ki.backend_Lamda_stream;

public class CreatingLambda {
	
	interface Greeting{
		public String sayHello(String s);
	}
	
	public void testGreeting(String s , Greeting g) {
		String result = g.sayHello(s);
		System.out.println("Result: "+result);
	}

	public static void main(String[] args) {
		//input -> body
		//(String s)-> "Hello "+s;
		new CreatingLambda().testGreeting("Prem", (String s)-> "Hello "+s);
		new CreatingLambda().testGreeting("Miss Ishi", (String s)-> "Hello "+s);
		new CreatingLambda().testGreeting("", (String s)-> !s.isEmpty()?"Howdy "+s:"Did you missed something!!");
		new CreatingLambda().testGreeting(null, (String s)-> s!=null?"Howdy "+s:"Don't suppose to send null");

	}

}
