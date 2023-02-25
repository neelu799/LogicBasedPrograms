import java.io.*;
import java.util.*;
class  StringIsInOrder
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s1 = obj.nextLine();
        	char ch[] = s1.toCharArray();
        	Arrays.sort(ch);
        	String s2 = new String(ch);
        	System.out.println(s1.equals(s2));
    	}
}