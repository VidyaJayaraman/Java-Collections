package Week3.Day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class FindMostDuplicateChar {

	public static void main(String[] args) {
		
		

		//Input String from user using scanner class
		
		System.out.println("Enter the string to find duplicate characters in it");
		Scanner scanner = new Scanner(System.in);
		String inputString=scanner.nextLine();
		
		// Convert string to char Array to traverse through each letters.
		
		char[] charArray = inputString.toCharArray();
		
		//Declare a map with Character as Key and Integer as value
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		// Add the key and value in Map by iterating through the character array
		
		for (char ch : charArray) {
			
			map.put(ch,map.getOrDefault(ch, 0)+1);
			
		}
		System.out.println("Original Map");
		System.out.println(map);		
		
		// To find the duplicate Character and its count
		
		// Create a entryset from map to get key and value
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet(); 
		
		// declare a list to add the output values which has dupChar and dupCharCount
		
		List<String> dupCharlist = new ArrayList<String>();
		boolean dupCheck=true;
		
		// Check Value corresponds to Key greater than one for each value in entryset
		
		for (Entry<Character, Integer> eachEntry : entrySet) {
			
			if(eachEntry.getValue()>1) {
				
				char dupChar = eachEntry.getKey();
				int dupCount = eachEntry.getValue();
				String str = dupChar+"------->"+dupCount; // concat Duplicate Char and its count
				dupCharlist.add(str);
				dupCheck=false; // dupcheck set to false if the string has duplicate
			}
		}
		
		// incase of no duplicates
		
		if(dupCheck==true)
		{
			System.out.println("No Duplicates in given string");
		}
		
		// incase if duplicates exists
		
		else
		{
		System.out.println("Duplicate Character and its Count");
		System.out.println(dupCharlist);
		}
		
		//To find the most duplicate character.
		
		int maxNum = 0;
		char maxDupChar=' ';
		for (Entry<Character, Integer> eachEntry1 : entrySet) {
			
			if(eachEntry1.getValue()>maxNum)
			{
				maxNum=eachEntry1.getValue();
			    maxDupChar=eachEntry1.getKey();
			}
		}
		
		System.out.println("Maximum duplicated character and its count is "+maxDupChar+"------->"+maxNum);
	}

}
