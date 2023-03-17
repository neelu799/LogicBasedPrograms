import java.io.*;
import java.util.*;
class Flight
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int w1=obj.nextInt();
        	int w2 = obj.nextInt();
        	int w3 = obj.nextInt();
        	int l1 = obj.nextInt();
        	int l2 = obj.nextInt();
        	System.out.println((w1+w2+w3<=l1+l2)?"Yes":"No");
    	}
}