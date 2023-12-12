package week1.day1;

public class Car {

	public static void main(String[] args) {
		
		//className objectName = new className();
		
		Car bmw = new Car();
		//objectName.MethodName(related)
		bmw.applybreak();
		bmw.applygear();
		bmw.switchOnAc();
		bmw.applyAcclerate();
		
		

	}

	public void applybreak() {
		System.out.println("Break is applied");
	}
	
	public void applygear() {
		System.out.println("Gear is applied");
	}
	
	public void switchOnAc() {
		System.out.println("Ac is on");
	}
	
	public void applyAcclerate() {
		System.out.println("acclerate is applied");
	}
}
