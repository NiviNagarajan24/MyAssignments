package week1.day3;

import java.util.Arrays;

public class FindSecondLargestInArray {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int length=data.length;
		int dataval=data[length-2];
		
		System.out.println(dataval);
		System.out.println(data[5]);
		

	}

}
