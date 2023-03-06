import java.io.*;
import java.util.*;
class SharedDigits 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i,x,c;
        	c=0;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	for(i=0;i<n-1;i++)
        	{
            	x=a[i];
           		while(x!=0)
            	{
                		if(Integer.toString(a[i+1]).contains(Integer.toString(x%10)))
                		{
                    		c++;
                    		break;
                		}
                		x=x/10;
            	}
        	}
        	System.out.println(c==n-1);
    	}
}