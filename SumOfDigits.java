import java.io.*;
import java.util.*;
class SumOfDigits 
{
    	static int sumofd(int n)
    	{
        	int d,s=0;
        	while(n!=0)
        	{
            	d=n%10;
            	s=s+d;
            	n=n/10;
        	}
       	return s;
    	}
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n1=obj.nextInt(),n2=obj.nextInt(),s=0,i;
        	for(i=n1;i<=n2;i++)
        	{
            	s=s+sumofd(i);
        	}
        	System.out.println(s);
    	}
}
