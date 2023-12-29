package week3.day2;

import java.util.Scanner;

public class ScannerPalindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the input");
		String nextLine=scan.nextLine();
		String rev="";
		char[]charArray=nextLine.toCharArray();
		for (int i = charArray.length-1; i>=0; i--) {
			rev=rev+charArray[i];}
			if (rev.equals(nextLine)) {
				System.out.println(nextLine+" is palindrome");
				
			}else {
				System.out.println(nextLine+"is not palindrome");
			}
				
			
		}
		
		
}




	


