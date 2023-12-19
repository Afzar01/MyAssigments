package week2.day2assignments;

public class Isprime {

	public static void main(String[] args) {
		int value=19;
		int s=0;
		for (int i =1; i <=value; i++) {
			if(value%i==0) s++;
		     
		}
			if (s>2) {
				System.out.println(value+" is not a Prime Number");
				
			}
			else {
				System.out.println(value+" is a Prime Number");
			}
		

	}

}

