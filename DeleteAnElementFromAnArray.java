import java.io.*;
import java.util.*;
class DeleteAnElementFromAnArray
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,loc,n=obj.nextInt();
        	LinkedList<Integer> ll = new LinkedList<Integer>();
        	for(i=0;i<n;i++)
            	ll.add(obj.nextInt());
        	if(ll.remove(new Integer(obj.nextInt())))
        	{
            	for(Object o:ll.toArray())
                		System.out.print(o+" ");
        	}
        	else
            	System.out.println(-1);
    	}
}
