package patterns;

public class p5 {
    // 8
    // 88
    // 888
    // 88
    // 8
    public static void main(String[] args) {
        int n=9;
        int star=0;
        for(int i=0;i<n;i++)
        {
            if(i>n/2)
            {
                star--;
            }
            else{
                star++;
            }

            for(int j=0;j<star;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
