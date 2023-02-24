import java.io.*;
import java.util.*;
class DuplicateCharacters 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	String rs = "";
        	for(int i=0;i<s.length();i++)
		{
            	char ch = s.charAt(i);
            	if(rs.indexOf(ch)<0)
                		rs=rs+ch;
       	 }
        	System.out.println(rs);
    	}
}