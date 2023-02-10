import java.util.Scanner;
class PinNumber 
{
	static int maxD(int n)
    	{
        	int m=0,d;
        	while(n!=0)
        	{
            d=n%10;
            if(m<d)
                m=d;
            n=n/10;
        	}
        	return m;
    	}
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n1=obj.nextInt();
        	int n2=obj.nextInt();
        	int n3=obj.nextInt();
        	int a,b,c,d,pin;
        	a = Math.min(Math.min(n1%10,n2%10),n3%10);
        	b = Math.min(Math.min((n1/10)%10,(n2/10)%10),(n3/10)%10);
        	c = Math.min(Math.min((n1/100)%10,(n2/100)%10),(n3/100)%10);
        	d = Math.max(Math.max(maxD(n1),maxD(n2)),maxD(n3));
        	pin = d*1000+c*100+b*10+a;
        	System.out.println(pin);
    	}
}