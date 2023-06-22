package week1.day3;


public class ArrayFindDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marksval= {32,25,32,58,62,32,62,58};
		int length=marksval.length;
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length; j++) {
				if(marksval[i]==marksval[j]) {
					System.out.println("Duplicate num:"+marksval[j]);
				}
			}
		}
	}

}
