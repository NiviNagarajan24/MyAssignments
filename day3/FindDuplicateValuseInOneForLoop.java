package week1.day3;

import java.util.Arrays;

public class FindDuplicateValuseInOneForLoop {
	public static void main(String[] args) {
		int[] inputval= {2,3,5,1,2,6,7,5,2,6};
		
		Arrays.sort(inputval);
		for (int i = 0; i < inputval.length-1; i++) {
			if(inputval[i]==inputval[i+1])
			{
				System.out.println("Duplicate num:"+inputval[i]);
			}
		}
		
		
		}
}
