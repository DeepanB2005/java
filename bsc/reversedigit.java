import  java.util.Scanner;
public class reversedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int rev=0;
        while(val>0)
        {
            int rem=val%10;         
            rev=rev*10+rem;         
            val=val/10;             
        }   
        System.out.println(rev);
    }

    
}
