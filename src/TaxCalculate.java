import java.util.Scanner;

public class TaxCalculate {
	
	

	public static void main(String[] args) {
		
		double tax = 0;
		double stateTax = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of taxable income of 2019:");
		double income = input.nextDouble();
		
		System.out.print("please enter 's' for single, and 'm' for married :- ");
		String maritalStatus =input.next();
		
		
		if(maritalStatus.equals("s")) {
			
			
			if (income <= 9875)
	            tax = income * 0.10;
	        else if (income <= 40125)
	            tax = 9875 * 0.10 + (income - 9875) * 0.12;
	        else if (income <= 85525)
	            tax = 9875 * 0.10 + (40125-9875) * 0.12 + (income-40125) * 0.22;
	        else if (income <= 163300)
	            tax = 9875 * 0.10 + (40125-9875) * 0.12 + (85525-40125) * 0.22 + (income - 85525) * 0.24;
	        else if (income <= 207350)
	            tax = 9875 * 0.10 + (40125-9875) * 0.12 + (85525-40125) * 0.22 + (163300-85525) * 0.24 + (income - 163300) * 0.32;
	        else if (income <= 518400)
	            tax = 9875 * 0.10 + (40125-9875) * 0.12 + (85525-40125) * 0.22 + (163300-85525) * 0.24 + (207350-163300) * 0.32 + (income - 207350) * 0.35;
	        else
	        	tax = 9875 * 0.10 + (40125-9875) * 0.12 + (85525-40125) * 0.22 + (163300-85525) * 0.24 + (207350-163300) * 0.32 + (518400-207350) * 0.35 +(income-518400) * 0.37 ;
	        
			
		}
		else
		{
			
			if (income <= 19750)
	            tax = income * 0.10;
	        else if (income <= 80250)
	            tax = 19750 * 0.10 + (income - 19750) * 0.12;
	        else if (income <= 171050)
	            tax = 19750 * 0.10 + (80250-19750) * 0.12 + (income-80250) * 0.22;
	        else if (income <= 326600)
	            tax = 19750 * 0.10 + (80250-19750) * 0.12 + (171050-80250) * 0.22 + (income - 171050) * 0.24;
	        else if (income <= 414700)
	            tax = 19750 * 0.10 + (80250-19750) * 0.12 + (171050-80250) * 0.22 + (326600-171050) * 0.24 + (income - 326600) * 0.32;
	        else if (income <= 622050)
	            tax = 19750 * 0.10 + (80250-19750) * 0.12 + (171050-80250) * 0.22 + (326600-171050) * 0.24 + (414700-326600) * 0.32 + (income - 414700) * 0.35;
	        else
	        	tax = 19750 * 0.10 + (80250-19750) * 0.12 + (171050-80250) * 0.22 + (326600-171050) * 0.24 + (414700-326600) * 0.32 + (622050-414700) * 0.35 +(income-622050) * 0.37 ;
	        
		}
		
		
		if (income <= 3000) {
			stateTax = income * 0.02;
		}
		else if (income <= 5000) {
			stateTax = 60 + (income - 3000) * 0.03; 
		}
		else if (income <=17000) {
			stateTax = 120 + (income - 5000) * 0.05;
		}
		else
		{
			stateTax = 720 + (income - 17000) * 0.0575;
		}
		
		System.out.println("your federal tax is: $" +tax);
		System.out.println("your state tax is: $" +stateTax);
	}
}

	
		
		
		
		
		
		
		
	


