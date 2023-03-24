import java.io.*;
import java.util.*;
class  TwoMatrixAreEqualOrNot
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int a[][]=new int[3][3];
        	int b[][]=new int[3][3];
        	int i,j,flag=1;
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
                		b[i][j]=obj.nextInt();
            	}
        	}
        	for(i=0;i<3;i++)
        	{
            	for(j=0;j<3;j++)
            	{
                		if(a[i][j]!=b[i][j])
				{
                    		flag=0;
                    		break;
                		}
            	}
        	}
        System.out.println((flag==1)?"Yes":"No");
    	}
}