import java.io.*;
import java.util.*;
class FirstIndexOfVowel 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	int n=s.length();
        	for(int i=0;i<s.length();i++)
		{
            	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
                		System.out.println(i);
                		break;
            	}
		}
    	}
}