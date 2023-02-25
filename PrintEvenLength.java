import java.io.*;
import java.util.*;
class PrintEvenLength 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s[] = obj.nextLine().split(" ");
        	for(String ss:s)
        	{
            	if(ss.length()%2==0)
                		System.out.print(ss+" ");
        	}
    	}
}