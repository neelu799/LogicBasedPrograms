import java.io.*;
import java.util.*;
class ValidHexCode
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine().toLowerCase();
        	System.out.println(s.matches("#[a-f0-9]{6}"));
    	}
}