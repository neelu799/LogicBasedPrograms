import java.io.*;
import java.util.*;
class RetriveLastNElements
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,m,i;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	m=obj.nextInt();
        	if(m<n)
        	{
            	for(i=n-m;i<n;i++)
                		System.out.print(a[i]+" ");
        	}
        	else
            	System.out.println(0);
    	}
}