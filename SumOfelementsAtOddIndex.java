import java.io.*;
import java.util.*;
class SumOfelementsAtOddIndex
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i,sum;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	sum=0;
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	for(i=0;i<n;i++)
        	{
            	if(i%2!=0)
                		sum=sum+a[i];
        	}
        	System.out.println(sum);
    	}
}