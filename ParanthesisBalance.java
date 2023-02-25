import java.io.*;
import java.util.*;
class ParanthesisBalance
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	int i,c1=0,c2=0;
        	for(i=0;i<s.length();i++)
        	{
            	if(s.charAt(i)=='(')
                		c1++;
           		if(s.charAt(i)==')')
                		c2++;
        	}
        	System.out.println(Math.abs(c1-c2));
    	}
}