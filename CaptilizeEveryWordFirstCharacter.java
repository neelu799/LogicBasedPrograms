import java.io.*;
import java.util.*;
class CaptilizeEveryWordFirstCharacter
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s[] = obj.nextLine().split(" ");
        	for(String ss:s)
            	System.out.print(ss.substring(0,1).toUpperCase()+ss.substring(1)+" ");
    	}
}