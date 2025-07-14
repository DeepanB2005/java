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
