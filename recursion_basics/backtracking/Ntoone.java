package backtracking;

public class Ntoone {
    public static void main(String[] args) {
        rec(1,5);
    }
    static void rec(int a,int n)
    {
        if(a>n)
        {
            return;
        }
        rec(a+1,n);
        System.out.println(a);
    }
}
