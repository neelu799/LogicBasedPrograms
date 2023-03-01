import java.io.*;
import java.util.*;
class DeletingAnElementInArrayFromGivenLocation
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,loc,n=obj.nextInt();
        	LinkedList<Integer> ll = new LinkedList<Integer>();
        	for(i=0;i<n;i++)
            	ll.add(obj.nextInt());
        	ll.remove(obj.nextInt());
        	for(Object o:ll.toArray())
            	System.out.print(o+" ");
    	}
}