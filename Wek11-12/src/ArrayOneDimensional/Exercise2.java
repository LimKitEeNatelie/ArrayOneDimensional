package ArrayOneDimensional;

public class Exercise2 {

	public static void main(String[] args) {
		//Write a statement that declares a string array initialized with the following strings:
		//"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
		
		// Write a loop that displays the contents of each element in the array that you declared.
			
		//ForLoop
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		for (int i = 0; i<days.length; i++) {
			System.out.println(days[i]);
		}
		
		System.out.println();
		
		//WhileLoop
		int j = 0;
		while(j<days.length) {
			System.out.println(days[j]);
			j++;
		}
		
		System.out.println();
		
		//DoWhile Loop
		int k = 0;
		do {
			System.out.println(days[k]);
			k++;
		} while (k<days.length);
			
			
	}

}
