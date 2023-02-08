import java.util.Scanner;
class DuckNumber
{
	public static void main(String[] args) 
	{
      	Scanner sc = new Scanner(System.in);
        	String s = sc.nextLine();
        	System.out.println((s.contains("0"))?"Duck Number":"Not a Duck Number");
    }
}