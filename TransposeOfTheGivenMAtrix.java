import java.io.*;
import java.util.*;
class TransposeOfTheGivenMAtrix
{

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[][]=new int[3][3];
        int i,j;
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
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}