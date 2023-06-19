import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		 String str = "Hello, World!";
	        int[] frequency = new int[256]; // Assuming ASCII character set

	        // Iterate over the string and update the frequency array
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            frequency[c]++;
	        }

	        // Print the frequency of each character
	        for (int i = 0; i < frequency.length; i++) {
	            if (frequency[i] > 0) {
	                System.out.println((char) i + " occurs " + frequency[i] + " times");
	            }
	        }
	    }
	}
