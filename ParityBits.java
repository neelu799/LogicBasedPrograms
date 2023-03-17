import java.io.*;
import java.util.*;
class ParityBits 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n = obj.nextInt(),d,c=0;
        	while(n!=0)
        	{
           		d=n%2;
            	if(d==1)
                		c++;
            	n=n/2;
        	}
        	System.out.println((c%2==0)?"even":"odd");
    	}
}