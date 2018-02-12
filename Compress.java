import java.util.*;
import java.io.*;
import java.lang.*;


// compressString() is a method that returns a shortened string.
// aabccccaaa would return a2b1c4a3
class Compress {


	public static void main(String[] args) {
		String str = "aabcccccaaa";

		System.out.println(Compress.compressString(str));	
	}

	public static String compressString(String s) {
		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		char letter = c[0];
		int counter = 0;
		for (int start = 0; start < c.length; start++) {
			if (c[start] == letter) {

				counter++;
			}

			else {
				sb.append(letter);
				sb.append(counter);
				letter = c[start];
				counter = 1;
			}


		}
		sb.append(letter);
		sb.append(counter);


		return sb.toString();

		
		
	}

}