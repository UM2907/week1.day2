package week1.day2;

public class DuplicatesInArray 
{
	
	public static void main(String[] args) 
	{
		int[] arr= {12,14,15,13,14,66,77,667,15,77,12};
		int arrLen = arr.length;
		int count;
		for (int i=0;i<arrLen-1;i++)
		{
			count=0;
			for (int a=i+1;a<arrLen;a++)
			{
				if(arr[i]==arr[a]) 
				{
					count++;
				}
			}
			if (count>0) 
			{
				System.out.println(arr[i]);
			}
		}
		}

}
