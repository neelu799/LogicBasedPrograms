import java.io.*;
import java.util.*;
class UpdateEveryElement
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n=obj.nextInt(),i;
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	System.out.print(a[1]+" ");
        	for(i=1;i<n-1;i++)
            	System.out.print(a[i-1]*a[i+1]+" ");
        	System.out.print(a[n-2]);
    	}
}