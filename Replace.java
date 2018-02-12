import java.util.*;
import java.io.*;


// For this problem we are giving a string, and the 
// length of the string. The replaceBlank() will 
// return an array with '%20' inside the blanks
class Replace {



	public static void main(String[] apple) {

		char[] ls = "Mr John Smith      ".toCharArray();
		int num = 13;

		System.out.println(replaceBlank(ls,num));


	}

	public static char[] replaceBlank(char[] ls, int num){
		int head = num - 1;
		int tail;
		
		char[] output = new char[ls.length];
		tail = output.length - 1;
		for (int b = head; b >= 0; b--) {
			if (ls[b] != ' ') {
				output[tail--] = ls[b];

			}
			else {
				output[tail--] = '0';
				output[tail--] = '2';
				output[tail--] = '%';

			}
			
		}

		return output;
	}
}