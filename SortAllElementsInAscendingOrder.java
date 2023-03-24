import java.io.*;
import java.util.*;
class SortAllElementsInAscendingOrder
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,j,k;
        	int a[][]=new int[3][3];
        	int b[]=new int[9];
        	for(i=0;i<3;i++)
        	{
            	for(j=0;j<3;j++)
            	{
                		a[i][j]=obj.nextInt();
            	}
        	}
        	k=0;
        	for(i=0;i<3;i++)
        	{
            	for(j=0;j<3;j++)
            	{
                		b[k++]=a[i][j];
            	}
        	}
        	Arrays.sort(b);
        	k=0;
        	for(i=0;i<3;i++)
        	{
            	for(j=0;j<3;j++)
            	{
                		a[i][j]=b[k++];
            	}
        	}
        	for(i=0;i<3;i++)
        	{
            	for(j=0;j<3;j++)
            	{
                		System.out.print(a[i][j]+" ");
            	}
            	System.out.println();
        	}
    	}
}