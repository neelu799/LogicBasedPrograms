import java.io.*;
import java.util.*;
class SevenBoom
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	boolean flag=false;
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	for(i=0;i<n;i++)
        	{
            	if(Integer.toString(a[i]).contains("7"))
            	{
                		flag=true;
                		break;
            	}
        	}
        	System.out.println((flag)?"Boom!":"there is no 7 in the array");
    	}
}