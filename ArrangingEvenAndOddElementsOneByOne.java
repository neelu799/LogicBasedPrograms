import java.io.*;
import java.util.*;
class ArrangingEvenAndOddElementsOneByOne 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n=obj.nextInt();
        	int a[]=new int[n];
        	int i,k,j;
        	int b[]=new int[n/2];
        	int c[]=new int[n/2];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	Arrays.sort(a);
        	j=0;
        	for(i=0;i<n;i++)
        	{
            	if(a[i]%2==0)
                		b[j++]=a[i];
       	}
        	k=0;
        	for(i=0;i<n;i++)
        	{
           		if(a[i]%2!=0)
                		c[k++]=a[i];
        	}
        	i=0;
        	while(i<n/2)
        	{
            	System.out.print(b[i]+" "+c[i]+" ");
            	i++;
        	}
    	}
}
