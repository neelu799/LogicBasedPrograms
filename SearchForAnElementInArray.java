import java.io.*;
import java.util.*;
class SearchForAnElementInArray 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i,index,key;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	key=obj.nextInt();
        	index=-1;
        	for(i=0;i<n;i++)
        	{
            	if(key==a[i])
            	{
                		index=i;
                		break;
            	}
        	}
        	System.out.println(index);
    	}
}