import java.io.*;
import java.util.*;
class InsertingAnElementInFirstPositionOfArray 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i,ne;
        	n=obj.nextInt();
        	LinkedList<Integer> ll = new LinkedList<Integer>();
        	for(i=0;i<n;i++)
            	ll.add(obj.nextInt());
        	ne = obj.nextInt();
        	ll.addFirst(ne);
        	for(Object o:ll.toArray())
            	System.out.print(o+" ");
        
    	}
}