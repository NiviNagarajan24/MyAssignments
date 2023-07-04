package week3.day1;

public class ThisConstructor {
	public ThisConstructor() {
		System.out.println("default constructor");
	}
	
	public ThisConstructor(int x) 
	{
		this();
		System.out.println("1 arg parametrized constructor:"+x);
	}
	public ThisConstructor(int x,int y) 
	{
		this(5);
		int z=x+y;
		System.out.println("2 arg parametrized constructor:"+z);
	}
	


	public static void main(String[] args) {
		ThisConstructor tc=new ThisConstructor(25,62);
		
		
	}
}
