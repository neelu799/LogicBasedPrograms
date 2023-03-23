import java.io.*;
import java.util.*;
class MaxElementInEachRowOfMatrix
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[][]=new int[3][3];
        int i,j,max;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            max=a[i][0];
            for(j=0;j<3;j++)
            {
                if(max<a[i][j]){
                    max=a[i][j];
                }
            }
            System.out.println(max);
        }
    }
}