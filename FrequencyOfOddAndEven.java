import java.io.*;
import java.util.*;
class FrequencyOfOddAndEven 
{

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[][]=new int[3][3];
        int i,j,ec,oc;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        ec=0;
        oc=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(a[i][j]%2==0 && a[i][j]!=0)
                    ec++;
                if(a[i][j]%2!=0 && a[i][j]!=0)
                    oc++;
            }
        }
        System.out.println(oc);
        System.out.println(ec);
    }
}