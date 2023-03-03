import java.io.*;
import java.util.*;
class NoOfevenAndOddElements
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int ec,oc,i,n = obj.nextInt();
        	int a[] = new int[n];
        	for(i=0;i<n;i++)
            	a[i] = obj.nextInt();
        	ec=0;
        	oc=0;
        	for(i=0;i<n;i++)
        	{
            	if(a[i]%2==0)
                		ec++;
            	else
                		oc++;
        	}
        	System.out.println(ec);
        	System.out.println(oc);
    }
}