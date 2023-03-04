import java.io.*;
import java.util.*;
class ArrayOfMultiples
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,n,m;
        	n=obj.nextInt();
        	m=obj.nextInt();
        	for(i=1;i<=m;i++)
            	System.out.print(n*i+" ");
    	}
}