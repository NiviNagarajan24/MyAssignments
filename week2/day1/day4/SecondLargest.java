package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		List<Integer> list1=new ArrayList <Integer>();
		for (int i = 0; i < data.length; i++) {
			list1.add(data[i]);
		}
		Collections.sort(list1);
		int length=list1.size();
		System.out.println("Second largest num in the list is:"+data[length-1]);
	}

}
