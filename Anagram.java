import java.io.*;
import java.util.*;

class Anagram
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s1 = obj.nextLine();
        	String s2 = obj.nextLine();
        	char ch1[] = s1.toCharArray();
        	char ch2[] = s2.toCharArray();
        	Arrays.sort(ch1);
        	Arrays.sort(ch2);
        	System.out.println(Arrays.equals(ch1,ch2));
    	}
}