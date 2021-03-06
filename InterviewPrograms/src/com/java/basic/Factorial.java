package com.java.basic;

import java.util.Scanner;

/*
 * 	Factorial
 * 
 * In mathematics, the factorial of a positive integer n, 
 * denoted by n!, is the product of all positive integers 
 * less than or equal to n:
 * 
 *  n! can be written as 
 *  n! = 1 * 2 * 3 * .... * (n-1) * n;
 *  
 *  n! can also be written as
 *  n! = n * (n-1)!
 *  
 * eg: Factorial 4 ( 4! ) is equal to 24.
 * 4! = 4 * 3 * 2 * 1;
 * 5! = 5 * 4 * 3 * 2 * 1;
 * 5! = 5 * 4!
 *  
 */
public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the any number : ");
		int N = Integer.parseInt(scanner.nextLine().trim());
		
		int result =1;
		for(int i=1; i<=N; i++)
			result = result * i;
		
		String output = String.format("Factorial of %d is %d", N,result);
		System.out.println(output);
		scanner.close();
	}
}
/*
	OUTPUT
	
	Enter the any number : 5
	Factorial of 5 is 120
	
	Enter the any number : 10
	Factorial of 10 is 3628800

*/