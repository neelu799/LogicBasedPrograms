import java.io.*;
import java.util.*;
class ColumnWiseSumInMatrix
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int a[][]=new int[3][3];
        	int i,j,s;
        	for(i=0;i<3;i++)
        	{
            	for(j=0;j<3;j++)
            	{
                		a[i][j]=obj.nextInt();
            	}
       	}
        	for(i=0;i<3;i++)
        	{
            	s=0;
            	for(j=0;j<3;j++)
            	{
                		s=s+a[j][i];
            	}
            	System.out.println(s);
        	}
    	}
}