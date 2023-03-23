import java.io.*;
import java.util.*;
class MinElementInMatrix
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int a[][]=new int[3][3];
        	int i,j,min;
        	for(i=0;i<3;i++)
        	{
            	for(j=0;j<3;j++)
            	{
                		a[i][j]=obj.nextInt();
            	}
        	}
        	min=a[0][0];
        	for(i=0;i<3;i++)
        	{
            	for(j=0;j<3;j++)
            	{
                		if(min>a[i][j])
				{
                    		min=a[i][j];
                		}
            	}
        	}
        	System.out.println(min);
    	}
}