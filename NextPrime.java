import java.io.*;
import java.util.*;
class NextPrime 
{
    	public static void main(String[] args) 
	{
        	Scanner sc= new Scanner(System.in);
        	int n1=sc.nextInt();
		int n2=sc.nextInt();
        	while(true)
        	{
            	if(isprime(n))
            	{
                		System.out.println(n);
                		break;
            	}
            	n++;
        	}
    	}
}