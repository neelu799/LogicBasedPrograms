import java.io.*;
import java.util.*;
class SumOfAdjacentDistances
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i,sum;
        	n=obj.nextInt();
        	int a[] = new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	sum=0;
        	for(i=0;i<n-1;i++)
            	sum=sum+Math.abs(a[i]-a[i+1]);
        	System.out.println(sum);
    	}
}