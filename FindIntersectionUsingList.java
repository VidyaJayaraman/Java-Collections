package Week3.Day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Given Array
		
		int[] a = {3,2,11,4,6,7};
		int[] b = {1,2,8,4,9,7};
		
		// Declare two lists to add values from two array
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		// Iterate through the array a and add elements to list1
		
		for (int i : a) {	
			list1.add(i);
				
		}
		
		// Iterate through the array a and add elements to list2
		
		for (int j : b) {
			list2.add(j);	
		}
       
		// Declare list3 to add the output of intersected array elements
		
		List<Integer> list3 = new ArrayList<Integer>();
		
     for(int k=0;k<list1.size();k++) {
	 if(list1.get(k)==list2.get(k)) {
		list3.add(list1.get(k));
	}
	}

System.out.println("Intersection list");
System.out.println(list3);

	}
}
