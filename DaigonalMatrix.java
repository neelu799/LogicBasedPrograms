import java.io.*;
import java.util.*;
class DaigonalMatrix 
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i,j;
        int a[][]=new int[3][3];
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
                    System.out.print(a[i][j]+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}