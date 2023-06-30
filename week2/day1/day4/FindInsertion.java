package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class FindInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		List<Integer> array1=new ArrayList<Integer>();
		List<Integer> array2=new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			array1.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			array2.add(b[i]);
		}
		for (int i = 0; i < array1.size(); i++) {
			for (int j = 0; j < array2.size(); j++) {
				if(array1.get(i)==array2.get(j))
				{
					System.out.println(array1.get(i));

				}
			}
		}
	}

}


