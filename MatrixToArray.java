import java.io.*;
import java.util.*;
class MatrixToArray 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,j,n,m;
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
            	for(j=0;j<m;j++)
            	{
                		System.out.print(a[i][j]+" ");
            	}
        	}
    	}
}
