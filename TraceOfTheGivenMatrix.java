import java.io.*;
import java.util.*;
class TraceOfTheGivenMatrix 
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[][]=new int[3][3];
        int i,j,s=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                    s=s+a[i][j];
            }
        }
        System.out.println(s);
    }
}