import java.io.*;
import java.util.*;
class MiddleCharacter 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	int n=s.length();
        	if(n%2==0)
            	System.out.println(s.charAt(n/2-1)+""+s.charAt(n/2));
        	else
            	System.out.println(s.charAt(n/2));
    }
}