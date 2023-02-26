import java.io.*;
import java.util.*;
class FirstLetterOfEachWord
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s[] = obj.nextLine().split(" ");
        	for(String ss:s)
            	System.out.print(ss.charAt(0));
    	}
}