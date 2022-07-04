package br.com.benefrancis.nec;

import java.util.HashMap;
import java.util.Map;

public class Snippet {
	
	public boolean isIsomorphic(String s, String t) {
		
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
		
		
		Map<Character, Character> charMap = new HashMap<>();
		if (sChars.length == tChars.length) {
			
			for (int i = 0; i < sChars.length; i++) {
				
				if (charMap.containsKey(sChars[i])) {

					if (charMap.get(sChars[i]) != tChars[i]) {
						return false;
					}

				} else {
					if (charMap.containsValue(tChars[i])) {
						return false;
					} else {
						charMap.put(sChars[i], tChars[i]);
					}
				}
				
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Snippet s = new Snippet();

		System.out.println(s.isIsomorphic("badc", "babk"));

	}

}
