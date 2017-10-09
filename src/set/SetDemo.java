package set;

//program to copy all the elements from set2 to set1 so that the set1 becomes the union of set1 and set2

import java.util.*;//Importing Utility Package

public class SetDemo 
{

	public static void main(String[] args) //Start of main Class
	{
		
		// Creating two sets.
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 4, 6, 8,9,1,3));

		System.out.println("set1 before union: " + set1);
		System.out.println("set2 before union: " + set2);

		set1.addAll(set2);//Performing Union between set1 and set2

		System.out.println("set1 after union: " + set1);//Printing Set1 after union


	}//Close of Main Class	

}


