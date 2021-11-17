package activities;

public class Activity2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int numbers[] = {10,77,10,54,-11,10};
		int sum = 0;
		for (int i=0; i<=numbers.length-1; i++) 
		
		{
			if (numbers[i]==10) 
			{
				sum += numbers[i];
			}
		}
		System.out.println("The sum of tens in the array is " + sum);
		
		int totsum = 30;
		
		if (totsum==sum)
		{
			 System.out.println("The sum is 30 -> True");
		}
		else 
		{
			System.out.println("The sum is not 30 -> False");
		}
	}

}
