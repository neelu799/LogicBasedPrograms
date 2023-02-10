import java.io.*;
import java.util.*;
class ReverseData 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	StringBuffer sb = new StringBuffer(s);
        	System.out.println(sb.reverse());
    	}
}