package week1.day2;

public class ConvertNegativeToPositiveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=40;
		if(num<0)
		{
			System.out.println(num+" is a negative number");
			if(num<0)
			{
				num=num*(-1);
			}
			System.out.println(num+" is a converted from negative to positive number");
			
		}
		else
		{
			System.out.println("positive number");
		}
	}

}
