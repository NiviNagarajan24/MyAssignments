package week1.day3;

public class PrintDuplicateValuesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count=0;
		for (int i = 0; i <= arr.length-1; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate values:"+arr[j]);
					count++;
					
				}
			}
		}

	}

}
