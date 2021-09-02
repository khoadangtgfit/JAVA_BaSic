package String;

public class StringAnagram {
    public static void CheckStringAnagram(String a,String b) {
        StringBuilder bd=new StringBuilder(a);
        String c=bd.reverse().toString();
        if(b.equals(c)==true) System.out.println("OK");
        else System.out.println("KO");
    }  
    public static void main(String[] args) {
        CheckStringAnagram("ds","hid");
    } 
}
