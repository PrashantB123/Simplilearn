package calculator;

import java.util.Scanner;

public class ArithmaticCalculator {
	public static void main(String[] args) {
		
		char operator;
		double num1,num2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the operator( +, -, *, / ) :");
		
		operator = input.next().charAt(0);
		
		System.out.println("Enter two number one by one");
		
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		
		input.close();
		
	    switch(operator) {
	    
	    case '+':
	    System.out.printf("%.2f + %.2f = %.2f", num1,num2,(num1+num2));
	    break;
	    
	    case '-':
		    System.out.printf("%.2f - %.2f = %.2f", num1,num2,(num1-num2));
		    break;
		    
	    case '*':
		    System.out.printf("%.2f * %.2f = %.2f", num1,num2,(num1*num2));
		    break;
		    
	    case '/':
	    	if(num2 != 0)
		       System.out.printf("%.2f / %.2f = %.2f", num1,num2,(num1/num2));
		    else
		    	System.out.println("Divide by zero situation");
	    	break;
	    	
	    default:
	    	System.out.printf("%c is invalid operatot", operator);
	    }
	    
	    	
	    	
		   
	    
	    }
		
		
	}


