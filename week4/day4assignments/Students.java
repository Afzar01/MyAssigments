package week4.day4assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("id:"+id);
		
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("id:"+id+" name:"+name);
	}
	public void getStudentInfo(long phoneNumber,String email) {
		System.out.println("phoneNumber:"+phoneNumber+"email:"+ email);
	}
	public static void main(String[] args) {
		Students info =new Students();
		info.getStudentInfo(10023);
		info.getStudentInfo(100230,"Afzar");
		info.getStudentInfo(9988445566L,"afzar45@gmail.com");
		
	}

}
