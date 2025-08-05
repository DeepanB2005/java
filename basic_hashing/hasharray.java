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
            a[i]=sc.nectInt();
        }

        int hash[] = new int[11];

        for(int i=0;i<hash.length;i++)
        {
            hash[a[i]]+=1;
        }
        int ip=sc.nextInt;

        while(ip--)
        {
            int i=sc.nextInt;
            System.out.println(hash[i]);
        }
    }
}