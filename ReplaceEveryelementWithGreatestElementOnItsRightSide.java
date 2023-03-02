import java.io.*;
import java.util.*;
class ReplaceEveryelementWithGreatestElementOnItsRightSide
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i,max,j;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	for(i=0;i<n;i++)
		{
            	max=a[i];
            	for(j=i+1;j<n;j++)
			{
                		if(max<a[j])
                    	max=a[j];
            	}
            	a[i]=max;
        	}
        	for(i=0;i<n;i++)
            	System.out.print(a[i]+" ");
    	}
}