import java.io.*;
import java.util.*;
class PositionOfAlphabet 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine().toLowerCase();
        	for(int i=0;i<s.length();i++)
        	{
            	if(s.charAt(i)>='a' && s.charAt(i)<='z')
                		System.out.print(s.charAt(i)-96+" ");
        	}
    	}
}