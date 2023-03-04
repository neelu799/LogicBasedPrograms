import java.io.*;
import java.util.*;
class MiniPeaks
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,n;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	for(i=1;i<n-1;i++)
        	{
            	if(a[i]>a[i-1] && a[i]>a[i+1])
                		System.out.print(a[i]+" ");
        	}
    	}
}