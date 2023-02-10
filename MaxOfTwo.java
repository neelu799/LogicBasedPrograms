import java.io.*;
import java.util.*;
class MaxOfTwo 
{
    	static int bj(int n1,int n2)
    	{
        	if(n1>21 && n2>21)
            	return 0;
        	if(n1>21)
            	return n2;
        	else if(n2>21)
            	return n1;
        	else
            	return Math.max(n1,n2);
    	}
    	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
        	int n1 = obj.nextInt();
        	int n2 = obj.nextInt();
        	System.out.println(bj(n1,n2));
    	}
}