package String;

public class CountNumberOfVowelsAndConsonants {
    public static void CountVowels(String s) {
        String v="ueoai";
        int N=0;
        for(int i=0;i<s.length();i++){
            if(v.contains(String.valueOf(s.charAt(i)))){
                N++;
            }
        }
        System.out.println("So nguyen am = "+N);
        System.out.println("So phu am = "+(s.length()-N));
    }
    public static void main(String[] args) {
         String s="java";
         String t="aa";
        //  CountVowels(s);
        // System.out.println(s.contains(String.valueOf(t.charAt(1))));
        String c="1234";
        int x=Integer.valueOf(c);
        System.out.println(c+12);
        System.out.println(x+12);
    }
}
