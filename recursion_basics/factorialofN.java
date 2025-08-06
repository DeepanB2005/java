public class factorialofN {
    public static void main(String[] args) {
        System.out.println(rec(5));
    }
    static int rec(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*rec(n-1);
        
    }
} 
// 5*4*3*2*1        
import java.util.Scanner;

class hash
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n]; // normal array
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i:a)
        {
            System.out.print(i);
        }
        int hash[] = new int[11];

        // Fix: Loop over the input array, not hash array

        for (int i = 0; i < n; i++)
        {
            hash[a[i]] += 1;
        }
        int ip = sc.nextInt();

        while (ip > 0)
        {
            int i = sc.nextInt();
            System.out.print(" "+hash[i]);
            ip--;
        }
    }
}