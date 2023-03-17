import java.io.*;
import java.util.*;
class SecretInformation 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	for(int i=0;i<s.length();i++)
        	{
            	if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='0'&&s.charAt(i)<='9'))
                	System.out.print(s.charAt(i));
        	}
    	}
}
