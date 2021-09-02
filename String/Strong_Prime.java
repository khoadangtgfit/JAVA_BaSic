package String;

public class Strong_Prime {
    public static boolean Check_PrimeNumber(int n) {
        if(n<2)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static boolean Check_StrongPrimeNumber(int n) {
        if(n<11)
            return false;
        if(Check_PrimeNumber(n)==true){
            int S=0;
            while(n>0){
                S+=n%10;
                n/=10;
            }
            if(Check_PrimeNumber(S)==true)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=23;
        System.out.println(Check_PrimeNumber(134));
    }
}