import java.io.*;
import java.util.*;
class DeleteAnElementFromLastLocation
{
    	public static void main(String[] args) 	
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i;
        	n=obj.nextInt();
        	LinkedList<Integer> ll = new LinkedList<Integer>();
        	for(i=0;i<n;i++)
            	ll.add(obj.nextInt());
        	ll.removeLast();
        	for(Object o:ll.toArray())
            	System.out.print(o+" "); 
    	}
}