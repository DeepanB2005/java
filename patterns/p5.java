package patterns;
class p5
{
    public static void main(String[] args) {
        int n=9;
        int s=0;
        for(int i=0;i<n;i++)
        {
            if(i<n/2)
            {
                s++;
            }
            else
            {
                s--;
            }
            for(int j=0;j<s;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}