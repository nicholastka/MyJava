
// The isUnique method will determine if all characters in the String are unique
// I implemented a set to take care of this
// Nicholas Tkalych

import java.util.*;
import java.io.*;


class Unique {



	public static void main(String[] apple) {

		String str = "abcdefg";
		String test = "aaaabbb";

		Unique one = new Unique();
		System.out.println(one.isUnique(str));
		System.out.println(one.isUnique(test));


	}

	public boolean isUnique(String S){
	Set<Character> st = new HashSet<>();
	int length = S.length();

	for (int a = 0; a < length; a++) {

		if (!st.contains(S.charAt(a))){
			st.add(S.charAt(a));
		}

		else {
			return false;
		}
	}
	return true;
}
}