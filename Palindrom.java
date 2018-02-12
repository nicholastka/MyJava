import java.util.*;
import java.io.*;


class Palindrom {




	public static void main(String[] args) {
		
		String str = "aabd";

		System.out.println(Palindrom.isPalindrome(str));
	}

	public static boolean isPalindrome(String str) {

		Map<Character,Integer> mp = new HashMap<>();

		char[] c = str.toCharArray();
		int length = c.length;

		for (int a = 0; a < length; a++) {
			if (!(mp.containsKey(c[a]))) {

				mp.put(c[a],0);
			}

			else{
				mp.put(c[a],mp.get(c[a]) + 1);
			}
		}

		Collection<Integer> ls = mp.values();
		Iterator<Integer> it = ls.iterator();

		boolean bool = true;
		while (!it.hasNext()) {
			
			int value = it.next();

			if (value % 2 == 1) {
				if (!bool) {
					return false;
				}

				bool = false;
			}
		}

		return true;


	}



}


