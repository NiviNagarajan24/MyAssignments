package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "BossBaby";
		char[] ch=name.toCharArray();
		Set <Character> nameset=new LinkedHashSet<Character>();
		for (Character i : ch) {
			nameset.add(i);

		}
		System.out.println(nameset);
	}

}

