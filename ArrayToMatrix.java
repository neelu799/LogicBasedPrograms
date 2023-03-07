import java.io.*;
import java.util.*;
class ArrayToMatrix
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,j,k,n,m;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	m=(int)Math.sqrt(n);
        	k=0;
        	for(i=0;i<m;i++)
        	{
            	for(j=0;j<m;j++)
            	{
                		System.out.print(a[k++]+" ");
            	}
            	System.out.println();
        	}
    	}
}