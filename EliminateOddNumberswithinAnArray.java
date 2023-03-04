import java.io.*;
import java.util.*;
class EliminateOddNumberswithinAnArray 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	for(i=0;i<n;i++)
        	{
            	if(a[i]%2==0)
                		System.out.print(a[i]+" ");
        	}
    	}
}