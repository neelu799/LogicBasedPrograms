import java.io.*;
import java.util.*;
class SquareOfEachElementInMatrix 
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
                System.out.print(a[i][j]*a[i][j]+" ");
            }
            System.out.println();
        }
    }
}