package CalculatorApp;

public class CalculatorApp {

	public static void Add(int first,int second) {
		int result=first+second;
		System.out.println("The result of the sum is " + result);	
		}
	
	public static void Subtract(int first,int second) {
		int result=first-second;
		System.out.println("The result of the difference is " + result);	
	}
	
	public static void Multiply(int first,int second) {
		int result=first*second;
		System.out.println("The result of the product is " + result);
	}
	
	
	public static void Divide(int first,int second) {
		int result=first/second;
		System.out.println("The result of the quotient is " + result);
	}
	
	public static void Modulo(int first,int second) {
		int result=first%second;
		System.out.println("The result of the modulo is " + result);
	}

}
