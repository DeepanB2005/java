import java.util.Scanner;

class hash
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];//normal array
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

         for(int i:a)
        {
            System.out.print(i);
        }

        int hash[] = new int[11];

        for(int i=0;i<n;i++)
        {
            hash[a[i]]+=1;
        }

        for(int i:hash)
        {
            System.out.print(i+" ");
        }
    }
}
