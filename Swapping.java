import java.io.*;
import java.util.*;
class Swapping 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String[] s = obj.nextLine().split(" ");
        	System.out.print(s[s.length-1]+" ");
        	for(int i=s.length-2;i>=1;i--)
            	System.out.print(new StringBuffer(s[i]).reverse()+" ");
        	System.out.print(s[0]);
    	}
}