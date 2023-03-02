import java.io.*;
import java.util.*;
class NoOfDuplicatesElements
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n=obj.nextInt();
        	int a[]=new int[n];
        	int b[]=new int[999];
        	int i,c=0;
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	for(i=0;i<n;i++)
            	b[a[i]]++;
        	for(i=0;i<999;i++)
        	{
            	if(b[i]>=2)
                		c++;
        	}
        	System.out.println(c);
    	}
}