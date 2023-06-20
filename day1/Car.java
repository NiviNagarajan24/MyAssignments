package week1.day1;

public class Car {
	public void driveCar()
	{
		System.out.println("Drive car");
	}
	public void applyBrake()
	{
		System.out.println("Apply brake");
	}
	public void soundHorn()
	{
		System.out.println("SoundHorn");
	}
	public void isPuncture()
	{
		System.out.println("isPuncture");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car objname=new Car();
		objname.driveCar();
		objname.applyBrake();
		objname.soundHorn();
		objname.isPuncture();
	}

}
