import java.util.Scanner;
class BookShelves
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        	if(n>=30 && n<=50)
            	System.out.println("D");
        	else if(n>=51 && n<=60)
            	System.out.println("C");
        	else if(n>=61 && n<=80)
            	System.out.println("B");
        	else
            	System.out.println("A");
	}
}