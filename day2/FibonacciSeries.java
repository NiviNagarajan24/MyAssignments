package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=8;
		int firstnum=0;
		int secondnum=1;
		System.out.println(firstnum+ " "+secondnum);
		for(int i=2;i<input;i++)
		{
			int num3=firstnum+secondnum;
			System.out.println(""+num3);
			firstnum=secondnum;
			secondnum=num3;
		}
	}

}
