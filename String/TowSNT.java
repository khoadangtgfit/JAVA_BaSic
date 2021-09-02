package String;

public class TowSNT {
    public static boolean KTSNT(int n) {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;
        return true;
        
    }
    public static int TongSNT(int a[]) {
        int n=a.length;
        int S=0,d=0;
        for (int i = 0; i < n; i++) {
            int vtmax=i;
            for(int j=i;j<n-1;j++){
                if(a[j]<a[j+1]){
                    vtmax=j+1;
                }
            }
            if(vtmax!=i){
                int t=a[i]; a[i]=a[vtmax]; a[vtmax]=t;
            }
            if(KTSNT(a[i])==true){
                S+=a[i];
                d++;
            }
            if(d==2){
                break;
            }
        }
        return S;
    }
    public static void main(String[] args) {
        int a[]={9,5,-2,6,-1,1};
        // System.out.println(TongSNT(a));
        char c='@';
        System.out.println(c);
    }
}
