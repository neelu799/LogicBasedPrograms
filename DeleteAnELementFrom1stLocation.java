import java.io.*;
import java.util.*;
class DeleteAnELementFrom1stLocation
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i;
        	n=obj.nextInt();
        	LinkedList<Integer> ll = new LinkedList<Integer>();
        	for(i=0;i<n;i++)
            	ll.add(obj.nextInt());
        	ll.removeFirst();
        	for(Object o:ll.toArray())
            	System.out.print(o+" ");
       }
}