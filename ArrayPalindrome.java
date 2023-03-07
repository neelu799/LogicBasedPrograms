import java.io.*;
import java.util.*;
class ArrayPalindrome
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,low,high,n,flag;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	flag=1;
        	low=0;
        	high=n-1;
        	while(low<=high)
        	{
            	if(a[low]!=a[high])
            	{
                		flag=0;
                		break;
            	}
            	low++;
            	high--;
        	}
        	System.out.println(flag==1);
    	}
}