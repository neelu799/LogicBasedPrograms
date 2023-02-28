import java.io.*;
import java.util.*;
class SortElementsInDescendingOrder 
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
        	for(i=n-1;i>=0;i--) 
            	System.out.print(a[i]+" ");
    }
}