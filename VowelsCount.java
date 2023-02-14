import java.io.*;
import java.util.*;
class VowelsCount 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	int count=0;
        	for(int i=0;i<s.length();i++)
		{
            	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                		count++;
        	}
        	System.out.println(count);
    	}
}