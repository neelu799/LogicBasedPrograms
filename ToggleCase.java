import java.util.Scanner;
import java.io.*;
class ToggleCase
{
	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	int i;
        	for(i=0;i<s.length();i++)
        	{
            	if(Character.isUpperCase(s.charAt(i)))
                		System.out.print((char)(s.charAt(i)+32));
            	else if(Character.isLowerCase(s.charAt(i)))
                		System.out.print((char)(s.charAt(i)-32));
        	}
    	}
}		