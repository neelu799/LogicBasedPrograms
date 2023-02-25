import java.io.*;
import java.util.*;
class MissingLetters
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	for(int i='a';i<='z';i++)
        	{
            	if(s.indexOf(i)==-1)
                		System.out.print((char)i);
        	}
    	}
}