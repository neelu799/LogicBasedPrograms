import java.io.*;
import java.util.*;
class BinarySearch
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,key,i;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	key=obj.nextInt();
        	Arrays.sort(a);
        	int index = Arrays.binarySearch(a,key);
        	System.out.println((index>=0)?index:-1);
    	}
}