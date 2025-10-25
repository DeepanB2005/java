package patterns;
import java.util.Scanner;
public class deepan {
    public static void main(String[] args) {

    {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<1;j++)
        {
            System.out.print("*");
        }
        for(int d=0;d<i;d++)
        {
            System.out.print(" ");
        }
        for(int k=i;k<i+1;k++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
    }
}
