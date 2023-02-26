import java.io.*;
import java.util.*;
class ReplaceCharacterWithOccurances
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	char ch = obj.nextLine().charAt(0);
        	int i,c=1;
        	for(i=0;i<s.length();i++)
        	{
            	if(s.charAt(i)==ch)
                		System.out.print(c++);
            	else
                		System.out.print(s.charAt(i));
        	}
    	}
}