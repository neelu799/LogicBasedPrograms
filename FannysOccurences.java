import java.io.*;
import java.util.*;
class FannysOccurences 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	char ch = obj.nextLine().charAt(0);
        	for(int i=0;i<s.length();i++)
        	{
            	if(s.charAt(i)==ch)
                		continue;
            	else
                		System.out.print(s.charAt(i));
        	}
    	}
}