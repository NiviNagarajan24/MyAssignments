package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> uniquenum=new LinkedHashSet<Integer>();
		Set<Integer> dupnum=new LinkedHashSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			boolean add = uniquenum.add(data[i]);
		
			if(!add) {
				dupnum.add(data[i]);
			}
			
		}
		System.out.println(dupnum);
		System.out.println(uniquenum);
	}

}
