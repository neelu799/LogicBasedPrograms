import java.io.*;
import java.util.*;
class SortElementsInAscendingOrder
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
            	System.out.print(a[i]+" ");
    	}
}