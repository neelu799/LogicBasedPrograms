import java.io.*;
import java.util.*;
class UniqueElementsInArray
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,n=obj.nextInt();
        	LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        	for(i=0;i<n;i++)
            	lhs.add(obj.nextInt());
        	for(Object o:lhs.toArray())
            	System.out.print(o+" ");
    	}
}