import java.io.*;
import java.util.*;
class NoOfVowels
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	int i,c=0;
        	for(i=0;i<s.length();i++)
        	{
            	char ch = s.charAt(i);
            	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                		c++;
        	}
        	System.out.println(c);
    	}
}