import java.io.*;
import java.util.*;
class GCDOfTwoNumbers
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n1 = obj.nextInt();
        	int n2 = obj.nextInt();
        	int n3=0,i;
        	for(i=1;i<=n1 && i<=n2;i++)
        	{
            	if(n1%i==0 && n2%i==0)
                	n3=i;
        	}
        	System.out.println(n3);
    	}
}