import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Count5SAndWin
{
	static int contains(int n)
      {
      	int c=0;
           	while(n!=0)
           	{
               	if(n%10==5)
                   	c++;
            	n=n/10;
           	}
           	return c;
      }    
      public static void main(String args[] ) throws Exception 
	{
           	Scanner obj = new Scanner(System.in);
           	int n,c,cc,x,element=0,i;
           	n=obj.nextInt();
           	int a[]=new int[n];
           	for(i=0;i<n;i++)
               	a[i]=obj.nextInt();
           	c=0;
           	cc=0;
           	for(i=0;i<n;i++)
           	{
               	x=contains(a[i]);
               	if(c<=x)
			{
                 		c=x;
                   	element=a[i];
               	}
               	if(x==0)
                   	cc++;
           }
           	System.out.println((cc==n)?a[0]:element);
	}
}