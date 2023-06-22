package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] words=test.split("");
		//test.toCharArray();
		test.split(test);
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (i % 2 == 0) {
				char[] testchar = test.toCharArray();
				for (int j =0;j>= testchar.length - 1; j--) {
					System.out.println(testchar[j]);
					System.out.println(" ");
					break;
				}

			}
        else {
       	 System.out.println(word+" ");
       }
		}
	}
}

