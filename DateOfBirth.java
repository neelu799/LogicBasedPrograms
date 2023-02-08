import java.util.Scanner;
class DateOfBirth
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String month=sc.next();
		int num=sc.nextInt();
		System.out.println((month.equals("may")&&num==18)?"Its her birthday":"Its not her birthday");
	}
}