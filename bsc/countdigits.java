import java.util.*;
public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int c=0;
        while(digit>10)
        {
            int rem=digit%10;//54546
            digit=(digit-rem)/10;
            c++;
        }
        System.out.println(c+1);
    }
}
