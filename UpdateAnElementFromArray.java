import java.io.*;
import java.util.*;
class UpdateAnElementFromArray
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,n,oe,ne;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	oe=obj.nextInt();
        	ne=obj.nextInt();
        	for(i=0;i<n;i++)
        	{
            	if(a[i]==oe)
                		a[i]=ne;
        	}
        	for(i=0;i<n;i++)
            	System.out.print(a[i]+" ");
    	}
}