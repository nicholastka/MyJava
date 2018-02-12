
// this method will check to see if both strings contain 
// the same number of types of character. An example would
// be checkPermutation('abc','bca') returning true
// Nicholas Tkalych

import java.util.*;
import java.io.*;



class Check {



	public static void main(String[] apple) {

		
		String string_one = "ecddbea";
		String string_two = "cedbead";
		String string_three = "aldfjabs";

		System.out.println("Test1: should return True");
		System.out.println(Check.checkPermutation(string_one,string_two));
		System.out.println("Test2: should return False");
		System.out.println(Check.checkPermutation(string_one,string_three));




	}



	public static boolean checkPermutation(String S,String T) {

		int len_S = S.length();
		int len_T = T.length();

		Map<Character,Integer> map_S = new HashMap<>();
		Map<Character,Integer> map_T = new HashMap<>();
		int value;


		for (int a = 0; a < len_S; a++) {
			char c = S.charAt(a);
			value = map_S.containsKey(c) ? map_S.get(c) : 0;
			map_S.put(c,value +1);
		}

		for (int b = 0; b < len_T; b++) {
			
			char d = T.charAt(b);
			value = map_T.containsKey(d) ? map_T.get(d) : 0;
			map_T.put(d,value + 1);
		}

		return (map_S.equals(map_T)) ? true : false;

	}


}