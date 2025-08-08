import java.util.Scanner;
class alph
{
    public static void main(String args[])
    {
        int hash[] = new int[26];
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i =0;i<s.length();i++)
        {
            int n=s.charAt(i)-'a';
            hash[n]+=1;
        }
        char o=sc.next().charAt(0);
        System.out.println(hash[o-'a']);
    }
}