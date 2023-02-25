import java.io.*;
import java.util.*;
class PrintNextLetter 
{
	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	for(int i=0;i<s.length();i++)
        	{
            	System.out.print((char)(s.charAt(i)+1));
        	}
    	}
}