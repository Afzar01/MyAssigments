package week3.day2;

import java.util.Scanner;

public class ScannerReverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the input");
		String rev="";
		String localVariable=scan.nextLine();
		char[] charArray=localVariable.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			 rev=rev+charArray[i];
			 
			
		}
System.out.println(rev);
	}

}
