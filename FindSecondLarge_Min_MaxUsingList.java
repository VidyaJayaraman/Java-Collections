package Week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindSecondLarge_Min_MaxUsingList {

	public static void main(String[] args) {
		
		//Declare a list
		List<Integer> list1 = new ArrayList<Integer>();
		
		//Create a  object for scanner class to get input such as list size and its elements
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the list");
		int size = scanner.nextInt();
		System.out.println("Enter the " + size +" elements one by one");
		
		// Iterate and add elements wrt list size

		for(int i =0; i<size ; i++)
		{
			int num = scanner.nextInt();
			list1.add(num);
		}
		// Print the original list
		System.out.println("Original list " + list1);
		
		//Sort the list to find Min & Max values
		Collections.sort(list1);
		System.out.println("Maximum Number in the list is "+ list1.get(size-1));
		System.out.println("Second Largest Number in the list is "+ list1.get(size-2));
		System.out.println("Minimum Number in the list is "+ list1.get(0));
	
		
	}

}
