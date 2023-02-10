import java.util.Scanner;
import java.io.*;
class Solution 
{
	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine().toLowerCase();
        	int i,count=0;
        	for(i=0;i<s.length();i++)
        	{
            	if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')||(s.charAt(i)==' '))
                		continue;
            	else
                		count++;
        	}
        	System.out.println(count);
    	}
}