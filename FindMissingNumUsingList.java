package Week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingNumUsingList {

	public static void main(String[] args) {

int a[] = {1,2,3,4,6,7,8};

	List<Integer> list = new ArrayList<Integer>();
	
	for (int eachNum : a) {
		
	list.add(eachNum);
		
	}
	System.out.println("Original list : "+list);
	Collections.sort(list);
	System.out.println("Sorted list : "+list);
	for(int i=0;i<list.size();i++)
	{
	
		if(list.get(i)!=i+1)
		{
			System.out.println("Missing num is");
			System.out.println(i+1);
			break;
		}
	}

  }

 } 
	

