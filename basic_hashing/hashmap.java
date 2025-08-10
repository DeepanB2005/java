import java.util.HashMap;
import java.util.Scanner;
class hashmap
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(a[i],i);
        }
        System.out.print(map);

    }
}