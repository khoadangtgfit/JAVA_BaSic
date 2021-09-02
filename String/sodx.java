
package String;
public class sodx {
    public static boolean KTDX(int n) {
        String s=n+"";
        int k=s.length();
        for(int i=0;i<k/2;i++)
            if(s.charAt(i)!=s.charAt(k-i-1))
                return false;
        return true;
    }
    public static int Find(int n) {
        int i=n+1;
        while(KTDX(i)==true){
            i++;
        }
        return ++i;
    }
    public static void main(String[] args) {
        int n=20;
        System.out.println(Find(n));
    }
}
