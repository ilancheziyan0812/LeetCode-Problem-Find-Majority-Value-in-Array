package LeetCode;

public class MajorityValue {
	
	public static void main(String[] args) {
		
		int [] values1 = {1,1,2,3,4,1,1};
		int [] values2 = {2,3,4,5,5,11,44,55,11,11,11,67,89};
		
		System.out.println(check(values1));
		System.out.println(check(values2));
	}
	public static int check(int [] values)
	{
		int length = values.length,count = 1,majority = values[0];
		
		for(int i=1;i<length;i++)
		{
			if(values[i] == majority)
			{
				count+=1;
			}
			else
			{
				count-=1;
				if(count==0)
				{
					majority = values[i];
					count = 1;
				}
			}
		}
		return majority;
	}

}
