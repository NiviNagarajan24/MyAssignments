package week1.day3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		char[] textArray=text.toCharArray();

		for (int i = 0; i < text.length(); i++)
		{

			
			for (int j = 0; j < i; j++)
			{
				if (textArray[i] == textArray[j])
				{
					System.out.print( textArray[i] );
					break;
				}
			}


		}

	}
}
