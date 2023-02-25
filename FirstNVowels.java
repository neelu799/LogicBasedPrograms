import java.io.*;
import java.util.*;
class FirstNVowels
{
	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	int n = obj.nextInt();
        	StringBuffer sb = new StringBuffer();
        	for(int i=0;i<s.length();i++)
		{
            	char ch = s.charAt(i);
            	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                		sb.append(ch);
        	}
        	if(n<sb.length())
        	{
            	for(int i=0;i<n;i++)
               		 System.out.print(sb.charAt(i));
        	}
        	else
            	System.out.println("invalid");
    	}
}