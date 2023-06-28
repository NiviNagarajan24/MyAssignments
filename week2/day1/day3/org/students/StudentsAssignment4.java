package week2.day3.org.students;

public class StudentsAssignment4 {
	public void getStudentInfo(int id) {
		System.out.println("Student id is:"+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student id and name are :"+id +","+name);
	}
	public void getStudentInfo(String email,long phonenum) {
		System.out.println("Student email and phonenum are"+email+","+phonenum);
	}
	public static void main(String[] args) {
		StudentsAssignment4 studentinfo=new StudentsAssignment4();
		studentinfo.getStudentInfo(56);
		studentinfo.getStudentInfo(56,"Nivi");
		studentinfo.getStudentInfo("nivi@gmail.com", 665352580);
	}
}
