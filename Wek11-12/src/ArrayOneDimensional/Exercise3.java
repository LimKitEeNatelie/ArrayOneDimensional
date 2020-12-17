package ArrayOneDimensional;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		//Write a program that creates an array of 10 elements size. 
		//Your program should prompt the user to input numbers in array and then display the sum of all array elements.
	    
		
		int[] number;
		number = new int[10];
		
		Scanner in = new Scanner (System.in);
		System.out.print("Enter number: ");
		
		for (int i=0; i<number.length; i++) {
			number[i] = in.nextInt();
		}
		
		for (int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
		int sum = 0;
		for (int i=0; i<number.length; i++) {
			sum += number [i];
		}
		System.out.println("ForLoop: Sum= " +sum);
		
		in.close();
	}

}
