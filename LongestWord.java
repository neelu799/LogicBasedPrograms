import java.io.*;
import java.util.*;
class LongestWord
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String[] s = obj.nextLine().split(" ");
        	int max=0;
        	String res="";
        	for(String ss:s)
		{
            	if(max<ss.length())
			{
                		max=ss.length();
                		res=ss;
            	}
        	}
        	System.out.println(res);
    	}
}