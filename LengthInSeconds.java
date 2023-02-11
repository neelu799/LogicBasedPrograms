import java.io.*;
import java.util.*;
class LengthInSeconds 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s[] = obj.nextLine().split(":");//["02","01"]
        	System.out.println(Integer.parseInt(s[0])*60+Integer.parseInt(s[1]));
    	}
}