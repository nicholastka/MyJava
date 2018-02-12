import java.util.*;
import java.io.*;

// will check to see if one string can be rotated a certain
// way to contain another string. "water" and "terwa"
// "terwa" can be rotated to "water" which is equal to "water"

class Rotate {


	public static void main(String[] args) {
		String s = "water";
		String t = "terwa";
		String o = "terww";

		System.out.println(Rotate.isSubstring(s,t));
		System.out.println(Rotate.isSubstring(s,o));
	}
	public static boolean isSubstring(String s, String t) {

		String check = t + t;
		return check.contains(s) ? true : false;
	}

}