/**
 * 
 */
package javaDay08;
import java.util.Scanner;
/**
 * @author rucha.joshi
 * Slide 23 - Computing Tax
 * Ask user for income and his status and tell the tax he needs to pay.
 */
public class Slide23_ComputeTax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double income = 0.0;
		double tax = 0.0;
		int taxRate = 0;
		int option = 0;
		
		Scanner input = new Scanner(System.in);
		
		//ask user for income
		do {
			System.out.println("Please enter your taxable income: ");
			try {
				income = input.nextDouble();
			}
			catch(Exception e) {
				System.out.println("Please enter numbers.");
				input.nextLine();
				continue;
			}
		}while(income < 0);
		
		
		//checking for input between 1 to 4 otherwise show error ask for input again
		do {
		System.out.println("Please select a number for your filing status from below options :");
		System.out.println("1. " + "Single" + "\n" +
						   "2. " + "Married Filing Jointly" + "\n" +
						   "3. " + "Married Filing Seperately" + "\n" + 
						   "4. " + "Head of Household");
		try {
		option = input.nextInt();}
		catch(Exception e) {
			System.out.println("Please enter a number between 1 to 4.");
			input.nextLine();
			continue;
		}
		}while(!(1 <= option && option <=4));
		
		if(option == 1) {
			if ((0 <= income) && (income <= 8350)) {
				taxRate = 10;
				tax = income * (10.0/100);
			} else if ((8351 <= income) && (income <= 33950)) {
				taxRate = 15;
				tax = income * (15.0/100);
			} else if ((33951 <= income) && (income <= 82250)) {
				taxRate = 25;
				tax = income * (25.0/100);
			} else if ((82251 <= income) && (income <= 171550)) {
				taxRate = 28;
				tax = income * (28.0/100);
			} else if ((171551 <= income) && (income <= 372950)) {
				taxRate = 33;
				tax = income * (33.0/100);				
			} else if (372951 <= income)  {
				taxRate = 35;
				tax = income * (35.0/100);				
			} 			
		} else if(option == 2) {
			if ((0 <= income) && (income <= 16700)) {
				taxRate = 10;
				tax = income * (10.0/100);				
			} else if ((16701 <= income) && (income <= 67900)) {
				taxRate = 15;
				tax = income * (15.0/100);
			} else if ((67901 <= income) && (income <= 137050)) {
				taxRate = 25;
				tax = income * (25.0/100);
			} else if ((137051 <= income) && (income <= 208850)) {
				taxRate = 28;
				tax = income * (28.0/100);				
			} else if ((208851 <= income) && (income <= 372950)) {
				taxRate = 33;
				tax = income * (33.0/100);				
			} else if (372951 <= income)  {
				taxRate = 35;
				tax = income * (35.0/100);				
			} 
		} else if(option == 3) {
			if ((0 <= income) && (income <= 8350)) {
				taxRate = 10;
				tax = income * (10.0/100);
			} else if ((8351 <= income) && (income <= 33950)) {
				taxRate = 15;
				tax = income * (15.0/100);				
			} else if ((33951 <= income) && (income <= 68525)) {
				taxRate = 25;
				tax = income * (25.0/100);
			} else if ((68526 <= income) && (income <= 104425)) {
				taxRate = 28;
				tax = income * (28.0/100);
			} else if ((104226 <= income) && (income <= 186475)) {
				taxRate = 33;
				tax = income * (33.0/100);				
			} else if (186475 <= income)  {
				taxRate = 35;
				tax = income * (35.0/100);				
			}
		} else if(option == 4) {
			if ((0 <= income) && (income <= 11950)) {
				taxRate = 10;
				tax = income * (10.0/100);				
			} else if ((11951 <= income) && (income <= 45500)) {
				taxRate = 15;
				tax = income * (15.0/100);				
			} else if ((45501 <= income) && (income <= 117450)) {
				taxRate = 25;
				tax = income * (25.0/100);				
			} else if ((117451 <= income) && (income <= 190200)) {
				taxRate = 28;
				tax = income * (28.0/100);				
			} else if ((190201 <= income) && (income <= 372950)) {
				taxRate = 33;
				tax = income * (33.0/100);				
			} else if (372951 <= income)  {
				taxRate = 35;
				tax = income * (35.0/100);
				
			}
		}
		System.out.println("Your tax rate will be " + taxRate + "%");
		System.out.printf("You will have to pay $%,.2f",tax);
		input.close(); //close the scanner
	}

}
