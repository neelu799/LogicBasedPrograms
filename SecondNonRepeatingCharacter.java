import java.io.*;
import java.util.*;
class SecondNonRepeatingCharacter
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	boolean u = false;
        	int i,j,c=0;
        	for(i=0;i<s.length();i++)
        	{
            	u=true;
            	for(j=0;j<s.length();j++)
            	{
                		if(i!=j && s.charAt(i)==s.charAt(j))
				{
                    		u=false;
                   	 	break;
                		}
            	}
            	if(u==true)
            	{
                		c++;
                		if(c==2)
                		{
                    		System.out.println(s.charAt(i));
                    		break;
                		}
            	}
        	}
    	}
}