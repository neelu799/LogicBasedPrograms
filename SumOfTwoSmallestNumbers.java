import java.io.*;
import java.util.*;
class SumOfTwoSmallestNumbers
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	Arrays.sort(a);
        	for(i=0;i<n;i++)
        	{
            	if(a[i]>=0)
			{
                		System.out.println(a[i]+a[i+1]);
                		break;
            	}
        	}
    	}
}