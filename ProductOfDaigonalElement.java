import java.io.*;
import java.util.*;
class ProductOfDaigonalElement 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int a[][]=new int[3][3];
        	int i,j,p=1;
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
                		if(i==j)
                    		p=p*a[i][j];
            	}
        	}
        	System.out.println(p);
    	}
}