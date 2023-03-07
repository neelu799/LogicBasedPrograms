import java.io.*;
import java.util.*;
class SweetSeventeen
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	System.out.println(Integer.valueOf(s,17));
    	}
}