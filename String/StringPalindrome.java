package String;

public class StringPalindrome {
    public static boolean CheckStringPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="121324";
        System.out.println(CheckStringPalindrome(s));
    }
}
