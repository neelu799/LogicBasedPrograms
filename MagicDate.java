import java.util.*;
import java.io.*;
class MagicDate 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in); 
        	String s[]=obj.nextLine().split("-");
        	int d = Integer.parseInt(s[0]);
        	int m = Integer.parseInt(s[1]);
        	int n = d*m;
        	String ss = Integer.toString(n);
        	System.out.println(s[2].endsWith(ss));
    }
}