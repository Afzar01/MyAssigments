package week4.day4assignments;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name");
	}
	public void studentDept() {
		System.out.println("Student Department");
	}
	public void studentId() {
		System.out.println("Student ID");
	}
	public static void main(String[] args) {
		Student b=new Student();
		b.collegeName();
		b.collegeCode();
		b.collegeRank();
		b.deptName();
		b.studentName();
		b.studentId();
		b.studentDept();
	}

}
