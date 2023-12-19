package week2.day2assignments;

public class Fibonacci {

	public static void main(String[] args) {
		int firstNum=0;
		int secNum=1;
		int n=11;
		for (int i = 0; i <=n; i++) {
			
				System.out.println(firstNum);
				int number=firstNum+secNum;
				firstNum=secNum;
				secNum=number;
				
		
			}
			
		}
		

	}


