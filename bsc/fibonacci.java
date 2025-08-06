public class fibonacci {
   
      public static void main(String[] args) {
        int co=4;
        int t=0;
        int a=0;
        int b=1;
        int c=0;
        while(t<co)
        {
            c=a+b;
            a=b;
            b=c;
            t++;
        }
        System.out.println(c);
      }
}
