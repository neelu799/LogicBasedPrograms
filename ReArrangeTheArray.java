import java.io.*;
import java.util.*;
class ReArrangeTheArray 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,low,high,i;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	Arrays.sort(a);
        	low=0;
        	high=n-1;
        	while(low<=high)
        	{
            	System.out.print(a[low]+" "+a[high]+" ");
            	low++;
            	high--;
        	}
    	}
}