package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name= "PayPal India";
		String output="";
		char[] ch=Name.toCharArray();
		Set <Character> UniNameset=new LinkedHashSet<Character>();	
		Set <Character> DupNameset=new LinkedHashSet<Character>();	
		for (Character i : ch) {
			if(!UniNameset.add(i))
			{
				DupNameset.add(i);
			}
		}
		
		UniNameset.removeAll(DupNameset);
		System.out.println(DupNameset);
		for (Character i : UniNameset) {
		    if (i != ' ') {
		        System.out.print(i);
		    }
		}

	}

}


