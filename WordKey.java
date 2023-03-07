import java.io.*;
import java.util.*;
class WordKey
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	String ss[] = 												{"break","case","continue","default","defer","else","for","func","goto","if","map","range","return","struct","type","var"};
        	boolean flag=false;
        	for(String sss:ss)
        	{
            	if(sss.equals(s))
            	{
                	flag=true;
                	break;
            	}
        	}
        	System.out.println(flag);
    	}
}