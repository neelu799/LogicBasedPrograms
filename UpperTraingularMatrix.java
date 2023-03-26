import java.io.*;
import java.util.*;
class UpperTraingularMatrix 
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i,j,flag=1;
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
                if(j<i && a[i][j]!=0)
                {
                    flag=0;
                    break;
                }
            }
        }
        System.out.println((flag==1)?"Yes":"No");
    }
}