package Week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.apache.commons.collections4.Get;

public class FindNumberOccuranceUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]  input = {2,3,3,5,6,3,2,1,4,2,1,6,-1};
		// Declaring Tree Map and checking the value field for given key in MAP.
		// If value exists ,then increment by 1
		// else assign key value as 1
		
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer> ();
		
		for (int eachNumber : input) {
			
			if(map.containsKey(eachNumber))
			{
				map.put(eachNumber,map.get(eachNumber)+1);
				
			}
			else
			{
				map.put(eachNumber,1);
				
			}
		}
		
		// Print the Original MAP
		
		System.out.println("Original Map");
		System.out.println(map);
		

		// Printing the Number and its corresponding no of occurrence
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        System.out.println();
		System.out.println("Number----->Occurance_Count");
		
		for (Entry<Integer, Integer> eachEntry : entrySet) {
			
			Integer number = eachEntry.getKey();
			Integer occurance = eachEntry.getValue(); 
			System.out.println(number+"----->"+occurance);	
		}
		
			
		
		
		// Find the max and count of occurrence of corresponding Number if the num is unique.
			
			int maxNumber = 0;
			int maxOccurrence =0;
			
				
		for (Entry<Integer, Integer> eachEntry1 : entrySet) {
			
			if(eachEntry1.getValue()>maxOccurrence)
			{
				
				maxOccurrence=eachEntry1.getValue();
				maxNumber = eachEntry1.getKey();
				
			}
			
		}
		
		
		System.out.println();
		System.out.println("Maximum occured number and its count in given sequence is ");	
		System.out.println(maxNumber+"------>"+maxOccurrence);	
		
	
	 // In case two number has same number of highest occurrence
		
		List<String> maxNum  = new ArrayList<String>(); // Declare a list to add the output (maxNum,maxOccurrence count
		
	for (Entry<Integer, Integer> eachEntry1 : entrySet) {
		
		if(eachEntry1.getValue()>=maxOccurrence) // two numbers have same highest value, so the condition is >=
		{
			
			maxOccurrence=eachEntry1.getValue();
			maxNumber = eachEntry1.getKey();
			String str = maxNumber + "----->" + maxOccurrence;
			maxNum.add(str);
			
		}
		
	}
	System.out.println("Maximum occured Number");
	System.out.println(maxNum);
	
	
	
	}
		
		
	}
		
		
	

