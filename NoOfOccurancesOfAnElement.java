import java.io.*;
import java.util.*;
class NoOfOccurancesOfAnElement 
{
    	public static void main(String[] args) 	
	{
        	Scanner obj = new Scanner(System.in);
        	int count,i,n=obj.nextInt(),key;
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	key=obj.nextInt();
        	count=0;
        	for(i=0;i<n;i++)
        	{
            	if(key==a[i])
                		count++;
        	}
        	System.out.println(count);
    	}
}