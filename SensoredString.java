import java.io.*;
import java.util.*;
class SensoredString
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s1 = obj.nextLine();
        	String s2 = obj.nextLine();
       	int i,j=0;
        	for(i=0;i<s1.length();i++)
        	{
            	if(s1.charAt(i)=='*')
                		System.out.print(s2.charAt(j++));
            	else
                		System.out.print(s1.charAt(i));
        	}
    	}
}