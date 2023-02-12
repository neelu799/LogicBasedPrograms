import java.io.*;
import java.util.*;
class ReformWord
{
    	public static void main(String[] args) 	
	{
        	Scanner obj = new Scanner(System.in);
        	String s1 = obj.nextLine();
        	String s2 = obj.nextLine();
        	System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1)+s2);
    	}
}