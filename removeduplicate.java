public class removeduplicate {
    public static void main(String[] args) {
        String s="abbcddece";
        
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    s= s.substring(0, j) + s.substring(j + 1);
                    j--;
                }
            }
        }
        for(int i: s.toCharArray())
        {
            System.out.print(i);
        }
        
    }
}
