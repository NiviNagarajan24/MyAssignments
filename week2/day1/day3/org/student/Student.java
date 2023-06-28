package week2.day3.org.student;

import week2.day3.org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("child-->studentName");
	}
	public void studentDept() {
		System.out.println("child-->studentDept");
	}
	public void studentId() {
		System.out.println("child-->studentId");
	}
	public static void main(String[] args) {
		Student info=new Student();
		info.collegeCode();
		info.collegeName();
		info.collegeRank();
		info.deptName();
		info.studentName();
		info.studentDept();
		info.studentId();
	}
}
