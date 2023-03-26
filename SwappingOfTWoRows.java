import java.io.*;
import java.util.*;
class SwappingOfTWoRows
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i,j,m,n,t;
        int a[][]=new int[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        m=obj.nextInt();
        n=obj.nextInt();
        for(i=0;i<3;i++)
        {
            t=a[m-1][i];
            a[m-1][i]=a[n-1][i];
            a[n-1][i]=t;
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}