package quizGame1;

import java.util.Random;

public class randomArray 
{
		public  int[] randomQ()
	{
		int f=1;
		int arr[]=new int[10];
		int i;int j;
		for(i=0;i<10;i++)
		{
			f=1;
		 	int min_val = 1;
	        int max_val = 17;
	        Random ran = new Random();
	        int xy = ran.nextInt(max_val) + min_val;

	        for(j=0;j<10;j++)
	        {
	        	if(arr[j]==xy)
	        	{
	        		i=i-1;
	        		f=0;
	        		break;
	        	}
	        }
	        if(f==0)
	        	continue;
	        else
	        	arr[i]=xy;
	     }
		return arr;
	}
		public int[] Ans()
		{
			int ans[]= {0,2,2,2,2,1,1,4,1,2,3,3,1,4,2,4,2,3};
			return ans;
		}


}
