package week1.day3;

public class ReverseAString {
	public static void main(String[] args) {
		String test="Amazon";
		test.toCharArray();
		for (int i = test.length()-1; i >=0; i--) {
			System.out.print(test.charAt(i));			
		}
	}
}
