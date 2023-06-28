package week2.day3;

public class Smartphone extends Androidiphone{
	public void takevideo() {
		System.out.println("takevideo in Smartphone");
	}
	
	public static void main(String[] args) {
		Smartphone phone=new Smartphone();
		phone.takevideo();
	}
}
