class sumofN
{
    public static void main(String[] args) {
        rec(5);
        System.out.println(sum);

    }
    static int sum=0;
    static void rec(int n)
    {
        sum+=n;
        if(n==0)
        {
            return;
        }
        rec(n-1);
    }
}