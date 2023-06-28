package week2.day3;

public class CreateCalculator {
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}
	public void add(int a, int b,int c) {
		System.out.println(a+b+c);
		
	}
	
	public void mul(double a, double b) {
		System.out.println(a*b);
		
		
	}
	public float mul(float a, float b) {
		return a*b;
		
	}
	public static void main(String[] args) {
		CreateCalculator addfun=new CreateCalculator();
		addfun.add(5,2);
		addfun.add(6,4,12);
		addfun.mul(154852,106);
		System.out.println(addfun.mul(1.5f, 8.0f));
		
		
		
	}
	
	
}
