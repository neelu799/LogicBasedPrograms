import java.io.*;
import java.util.*;
class PooledCabService
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i,x1,x2;
        	n=obj.nextInt();
        	x1=obj.nextInt();
        	x2=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	for(i=0;i<n;i++)
        	{
            	if(Math.abs(a[i])>=x1 && Math.abs(a[i])<=x2)
                		System.out.print(a[i]+" ");
        	}
    	}
}