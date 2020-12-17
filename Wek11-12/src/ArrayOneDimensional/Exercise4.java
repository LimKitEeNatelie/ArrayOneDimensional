package ArrayOneDimensional;
import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {
		//The variable list1 and list2 are reference arrays that each have 5 elements. 
		//Write code that copies the values in list1 to list2. Values in list1 are input by user.
		
		
		int[] list1;
		list1 = new int[5];
	
		Scanner in = new Scanner(System.in);
		System.out.println("List1 ");
		System.out.print("Enter 5 numbers: ");
		
		
		for (int i =0; i<list1.length; i++) {
			list1[i] = in.nextInt();
		}
		
	   System.out.println("List2: ");
       for (int i=0; i<list1.length; i++) {
    	   int[] list2 = list1;
    	   System.out.println(list2[i]);
       }
		
       
		in.close();
	}

}
