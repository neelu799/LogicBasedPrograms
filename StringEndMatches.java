import java.io.*;
import java.util.*;
class StringEndMatches  
{
    	public static void main(String[] args) 	
	{
        	Scanner obj = new Scanner(System.in);
        	String s1 = obj.nextLine();
        	String s2 = obj.nextLine();
        	System.out.println(s1.endsWith(s2));
    	}
}