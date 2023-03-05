import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class GarmentsCompanyApparel
{
	public static void main(String args[] ) throws Exception 
	{
      	Scanner obj = new Scanner(System.in);
            int n,i,k,c;
            n=obj.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
                	c=0;
            for(i=0;i<n;i++)
            {
            	for(k=1;k<=a[i];k++)
                  {
                  	if(k*k==a[i])
                        	c++;
                  }
            }
                	System.out.println(c);
      }
}