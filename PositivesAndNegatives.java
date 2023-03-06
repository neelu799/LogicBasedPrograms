import java.io.*;
import java.util.*;
class PositivesAndNegatives
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i;
        	n=obj.nextInt();
        	boolean flag=true;
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	for(i=0;i<n-1;i++)
        	{
            	if(a[i]>0 && a[i+1]>0)
            	{
                		flag=false;
               		break;
            	}
            	if(a[i]<0 && a[i+1]<0)
            	{
                		flag=true;
               		break;
            	}
        	}
        	System.out.println(flag);
    	}
}