class reverseanarray{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,0};
        rec(a,0,a.length-1);
        for(int i:a)
        {
            System.out.print(" "+i);
        }
    }
    static void rec(int[] a,int i,int j)
    {
        if(i>j)
        {
            return;
        }
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
        rec(a,i+1,j-1);
    }
}