package activities;

import java.util.Arrays;

public class Activity4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//int numbers[] = {8,6,4,3,1,9,7,5,2};
		int numbers []= {19,17,18,13,15,14,3,5,9,2,4,7,11,12,1};
		
		System.out.println("Array of numbers before sort "+ Arrays.toString(numbers));
		
		for (int i=0; i<numbers.length-1; i++) 
		{
			//System.out.println(numbers[i]);
			for (int j =i+1;j>0;j--) 
			{
				int low = numbers[j-1];
				int high= numbers[j];
				
				if (low>high) 
				{
					numbers[j-1]=high;
					numbers[j]=low;
				}
			}
		}
		System.out.println("Arrays of numbers after sort " + Arrays.toString(numbers));
	}
}
