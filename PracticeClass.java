package practice.helloword;

import java.util.*;

public class PracticeClass {

	public static List<Integer> getRow(int rowIndex){
		List<Integer> row  = new ArrayList<>();
		long number = 1;
		
		row.add((int)number);
		
		for(int i = 1;i<= rowIndex; i++) {
			number = number*(rowIndex -i+1)/i;
			row.add((int)number);
		}
		return row;
	}
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the row index: ");
		int rowIndex = scanner.nextInt();
		
		List<Integer> row  = getRow(rowIndex);
		
		System.out.println("The" + rowIndex +"th row of Pascal's triangle is:"+row);
		
		scanner.close();
	}

}
