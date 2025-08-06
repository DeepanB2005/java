class twosum
{
     int[] twosum(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        twosum t =new twosum();
        int t1[]=t.twosum(a,5);
        for(int i=0;i<t1.length;i++)
        {
            System.out.print(t1[i]+" ");
        }
    }
}

//actual for loop traversal format
// PS C:\Deepan B\java> java twosum.java
// 1i 2 j 3 j 4 j 
// 2i 3 j 4 j
// 3i 4 j
// 4i