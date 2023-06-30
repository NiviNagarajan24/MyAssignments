package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindFirstMissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		List <Integer> arr1ist=new ArrayList <Integer>();
		for (int i = 0; i < arr.length; i++) {
			arr1ist.add(arr[i]);
		}
		Collections.sort(arr1ist);
		for (int i = 1; i < arr.length; i++) {
			if(arr1ist.get(i-1)!=i) {
				System.out.println("Missing elements in an array:"+i);
				break;
			}
		}
	}

}
