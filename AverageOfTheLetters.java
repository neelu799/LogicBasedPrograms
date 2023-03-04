import java.io.*;
import java.util.*;
class AverageOfTheLetters 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,n,sum;
        	String s = obj.nextLine();
        	sum=0;
        	n=s.length();
        	for(i=0;i<n;i++)
            	sum=sum+(s.charAt(i)-96);
        	System.out.printf("%.2f",sum/(double)n);
    	}
}
