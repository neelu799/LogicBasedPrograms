import java.io.*;
import java.util.*;
class InclusiveArrayRanges
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,sn,en;
        	sn=obj.nextInt();
        	en=obj.nextInt();
        	if(sn<=en)
		{
            	for(i=sn;i<=en;i++)
                		System.out.print(i+" ");
       	}
        	else
            	System.out.print(sn);
    	}
}