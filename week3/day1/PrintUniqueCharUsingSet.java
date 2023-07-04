package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Stringname= "google";
		String output="";
		char[] ch=Stringname.toCharArray();
		Set<Character> uniquechar=new LinkedHashSet<Character>();
		for(Character i:ch) {
			if(!uniquechar.add(i))
			{
				output=output+i;
			}
		}
		System.out.println(uniquechar);
		System.out.println(output);
	}
}
