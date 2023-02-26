import java.io.*;
import java.util.*;
class CheckingDigits 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	int i,c=0;
        	for(i=0;i<s.length();i++)
        	{
            	if(s.charAt(i)>='0' && s.charAt(i)<='9')
                		c++;
        	}
        	System.out.println((c==s.length())?"Yes":"No");
    	}
}