import java.io.*;
import java.util.*;
class CheckingNoOfAbsents
{
    	public static void main(String[] args) 	
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	int i,ac=0;
        	for(i=0;i<s.length();i++)
        	{
            	if(s.charAt(i)=='A')    
				ac++;
        	}
        	System.out.println((ac>1 || s.contains("LLL"))?"No":"Yes");
    	}
}