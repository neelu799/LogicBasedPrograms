import java.io.*;
import java.util.*;
class SortAllElementsInColumnInAscOrder {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i,j;
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
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
                b[i][j]=a[j][i];
            }
        }
        for(i=0;i<3;i++)
        {
            Arrays.sort(b[i]);
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(b[j][i]+" ");
            }
            System.out.println();
        }
    }
}