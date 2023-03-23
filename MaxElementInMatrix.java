import java.io.*;
import java.util.*;
class MaxElementInMatrix
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int a[][]=new int[3][3];
        	int i,j,max;
        	for(i=0;i<3;i++)
        	{
            	for(j=0;j<3;j++)
            	{
                		a[i][j]=obj.nextInt();
            	}
        	}
        	max=a[0][0];
        	for(i=0;i<3;i++)
        	{
            	for(j=0;j<3;j++)
            	{
                		if(max<a[i][j])
				{
                    		max=a[i][j];
                		}
            	}
        	}
        	System.out.println(max);
    	}
}