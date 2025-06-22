public class smallestpalindrome {
    public static void main(String[] args) {
        String s = "abckocpba";
        String s1 = "";
        int n = s.length();
        

        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println(s);
            return;
        }
        
        for (int i = 0; i < n / 2; i++) {
            s1 += s.charAt(i);
        }
        
        for (int i = n / 2 - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        
        System.out.println(s1);
    }
}
