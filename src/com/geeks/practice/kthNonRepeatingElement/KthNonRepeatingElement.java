package com.geeks.practice.kthNonRepeatingElement;

import java.util.HashMap;
import java.util.Map;

public class KthNonRepeatingElement {

	public static void main(String[] args) {
        String inputString = "aassddeffguui";
        int position = 3;
        getNonRepeatingElement(inputString, position);
		
	}
	
	
	public static String getNonRepeatingElement(String set, int position){
		/*Map<Character, Integer> map = new HashMap<>();
		for (Character ch : set.toCharArray()) {
			if(map.get(ch) == null)
				map.put(ch, 1);
			else{
				map.put(ch, map.get(ch)+1);
			}
		}
		int count =0;
		for (Character ch : set.toCharArray()) {
			if(map.get(ch) == 1){
				count++;
				if(count == position)
				System.out.println(ch);
			}
				
		}
		*/
		return null;
	}

}
