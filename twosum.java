class twosum
{
    static void twosum(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"i ");

            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print(arr[j]+" j ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        twosum(a,3);
    }
}

//actual for loop traversal format
// PS C:\Deepan B\java> java twosum.java
// 1i 2 j 3 j 4 j 
// 2i 3 j 4 j
// 3i 4 j
// 4i