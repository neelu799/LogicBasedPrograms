import java.io.*;
import java.util.*;
class SalesReport
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,j,n,m,max;
        	n=obj.nextInt();
        	m=obj.nextInt();
        	int a[][]=new int[n][m];
        	for(i=0;i<n;i++)
        	{
            	for(j=0;j<m;j++)
            	{
                		a[i][j]=obj.nextInt();
            	}
        	}
        	for(i=0;i<n;i++)
        	{
            	max=a[i][0];
           	 	for(j=0;j<m;j++)
            	{
                		if(a[i][j]>max)
                    	max=a[i][j];
            	}
            	System.out.print(max+" ");
        	}
    	}
}