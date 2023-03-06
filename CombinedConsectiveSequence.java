import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class CombinedConsectiveSequence
{
	public static void main(String args[] ) throws Exception 
	{
      	Scanner obj = new Scanner(System.in);
            int i,co=0,k;
            int n1 = obj.nextInt();
            int a[] = new int[n1];
            for(i=0;i<n1;i++)
            	a[i] = obj.nextInt();
            int n2 = obj.nextInt();
            int b[] = new int[n2];
            for(i=0;i<n2;i++)
            	b[i]=obj.nextInt();        
            int c[] = new int[n1+n2];
                	k=0;
            for(i=0;i<n1;i++)
                  c[k++]=a[i];
            for(i=0;i<n2;i++)
                  c[k++]=b[i];
            Arrays.sort(c);
               	co=0;
            for(i=0;i<c.length-1;i++)
            {
                  if(c[i]+1 == c[i+1])
                  	co++;
            }
               	System.out.println(co==c.length-1);
 	 }
}