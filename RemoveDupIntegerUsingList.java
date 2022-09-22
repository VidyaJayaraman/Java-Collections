package Week3.Day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveDupIntegerUsingList {

	public static void main(String[] args) {

		// Declare a list
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		//Create a  object for scanner class to get input such as list size and its elements
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the list");
		int n = scanner.nextInt();
		System.out.println("Enter the " +n+" elements one by one");
		
		// Iterate and add elements wrt list size
		
		for(int i =0; i<n;i++)
		{
			int num = scanner.nextInt();
			list1.add(num);
		}
		// Print the original list
		
		System.out.println("Original list " + list1);
		
		//Sort the list
		
		Collections.sort(list1);
		
		// To check for duplicates by comparing next two values
		
		boolean dup=false;
		for(int j=0;j<list1.size()-1;j++) {
			
		// Remove elemenmts from list and set dup value as true
			
			if(list1.get(j)==list1.get(j+1)){
				list1.remove(j+1);
				dup=true;
			}
		}
		
		if(dup==true) {
	         System.out.println("After removing duplicates "+list1);
	    }
		else {
		     System.out.println("No duplicates found");	
		}
		
    }

}
