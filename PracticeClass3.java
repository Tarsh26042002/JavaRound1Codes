package practice.helloword;

import java.util.*;
public class PracticeClass3 {
	public static int integerBreak(int n) {
		if(n <=3) 
		return n-1;
		int product = 1;
		while(n>4) {
			product *= 3;
			n-=3;
		}
		product *= n;
		return product;
	}
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the integer n: ");
		int n = scanner.nextInt();
		
		int result = integerBreak(n);
		
		System.out.println("The maximum product is : "+result);
		
		scanner.close();
	}
}
