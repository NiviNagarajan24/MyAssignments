package week1.day2;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =30;
		for(int i=0;i<num;i++) {
			if(i%2!=0) {
				if(i==25) {
					System.out.println(i+" reached 25");
					continue;
				}
				System.out.println(i+" is a odd number");
			}
		}
	}
}
