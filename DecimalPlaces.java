import java.io.*;
import java.util.*;
class DecimalPlaces
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,c=0;
        	boolean flag=false;
        	String s = obj.nextLine();
        	for(i=s.length()-1;i>=0;i--)
		{
            	if(s.charAt(i)=='.')
            	{
                		flag=true;
                		break;
            	}
            	else
                		c++;
        	}
        	if(flag==false)
            System.out.println(0);
        	else
            	System.out.println(c);
    	}
}