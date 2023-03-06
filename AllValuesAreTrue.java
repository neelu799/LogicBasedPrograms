import java.io.*;
import java.util.*;
class AllValuesAreTrue
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	boolean flag=true;
        	for(i=0;i<n;i++)
        	{
            	if(a[i]==0)
            	{
                		flag=false;
                		break;
            	}
        	}
        	System.out.println(flag);
	}
}