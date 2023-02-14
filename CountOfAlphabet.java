import java.io.*;
import java.util.*;
class CountOfAlphabet 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	int i,xc=0,oc=0;
        	for(i=0;i<s.length();i++)
		{
            	if(s.charAt(i)=='x')
                		xc++;
            	if(s.charAt(i)=='o')
                		oc++;
        	}
        	System.out.println(xc==oc);
    	}
}