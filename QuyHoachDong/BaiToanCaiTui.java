package QuyHoachDong;

import java.util.Scanner;

/**
 * BaiToanCaiTui
 */
public class BaiToanCaiTui {
    /**
     * data
     */
    public static int [][] knapSack(int weight[],int value[],int n,int W){
        int K[][]=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int w=0;w<=W;w++){
                if(i==0||w==0)
                    K[i][w]=0;
                else if(w<weight[i])
                    K[i][w]=K[i-1][w];
                else 
                    K[i][w]=Math.max(K[i-1][w], value[i]+K[i-1][w-weight[i]]);
            }
        }
        return K;
    }
    public static void main(String[] args) {
        int weight[]={0,1,3,4,5};
        int value[]={0,1,4,5,7};
        int n=4;
        int W=7;
        int a[][]=knapSack(weight, value, n, W);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}