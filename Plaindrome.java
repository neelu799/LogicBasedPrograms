import java.util.*;
import java.io.*;
class Plaindrome
{
	public static void main(String[] args) 
	{
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println((s.equals(sb.toString()))?"valid":"invalid");
	}
}