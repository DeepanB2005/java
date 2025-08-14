import java.util.*;
class selenagomez
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        //selecting min
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i;j<n;j++)
            {
                min=a[j]<a[min]?j:min;
            }
            int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}