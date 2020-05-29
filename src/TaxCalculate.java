import java.util.Scanner;

public class TaxCalculate {
	
	

	public static void main(String[] args) {
		
		double tax = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of taxable income of 2019:");
		double income = input.nextDouble();
		
		System.out.print("please enter 's' for single, and 'm' for married");
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
			
		}
		
		System.out.print("your federal tax is: " +tax);
	}
}

	
		
		
		
		
		
		
		
	


