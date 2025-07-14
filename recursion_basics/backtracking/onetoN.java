package backtracking;
class onetoN
{
    public static void main (String args[])
    {
        rec(1,7);
    }
    static void rec(int a,int n)
    {
        if(a>n)
        {
            return;
        }
        System.out.println(a);
        rec(a+1,n);

    }
}