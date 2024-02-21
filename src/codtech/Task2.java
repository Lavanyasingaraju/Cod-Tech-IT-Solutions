package codtech;


import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		double num1,num2,result;
		char operator;
		
		System.out.println("\n  Basic Calculator:");
		System.out.println("\n you need to choose the operator : +,-,*,/,\n");
		
      //first input
		System.out.println("\n Enter first number");
		num1=sc.nextDouble();
		
		//operator
				System.out.println("\n Enter the operation (+,-,*,/)\n");
				operator=sc.next().charAt(0);
		
		
     //second input
		System.out.println("\n Enter second number");
		num2=sc.nextDouble();
		
		
		
		// Perform calculation
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("\nResult: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("\ntResult: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("\nResult: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("\nResult: " + result);
                } else {
                    System.out.println("\n Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("\n  Invalid operator. Please choose  +, -, *, /");
        }

		
        sc.close();
	}

}
