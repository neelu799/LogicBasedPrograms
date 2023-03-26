import java.io.*;
import java.util.*;
class SparseMatrix 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,j,c=0;
        	int a[][]=new int[3][3];
        	for(i=0;i<3;i++)
        	{
            	for(j=0;j<3;j++)
            	{
                		a[i][j]=obj.nextInt();
            	}
        	}
        	for(i=0;i<3;i++)
        	{
            	for(j=0;j<3;j++)
            	{
                		if(a[i][j]==0)
                    		c++;
            	}
        	}
        	System.out.println((c>=5)?"Yes":"No");
    	}
}