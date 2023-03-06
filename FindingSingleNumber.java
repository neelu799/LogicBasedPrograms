import java.io.*;
import java.util.*;
class FindingSingleNumber
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n=obj.nextInt(),i,j,t;
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	for(i=0;i<n;i++)
        	{
            	t=0;
            	for(j=0;j<n;j++)
            	{
                		if(i!=j && a[i]==a[j])
                    		t++;
            	}
            	if(t==0)
                		System.out.println(a[i]);
        	}
    	}
}