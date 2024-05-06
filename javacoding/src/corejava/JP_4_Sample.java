package corejava;

//import com.sun.tools.jdeprscan.scan.Scan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JP_4_Sample {
    static String name = "Kiran";
    public static void main(String[] args) {

//        System.out.println(name);
        System.out.println(findFactors(48));
        System.out.println(spf(50));
    }
    static int[] spf(int n){

        int[] ans = new int[n+1];
        int[] spf=new int[n+1];
        spf[1] = 0;
        for(int i=2; i*i<=n; i++){
            if(spf[i] == i){
                for(int j=i*i; j<=n; j+=i){
                    if(spf[j] == j)
                        spf[j] = i;
                }
            }
        }

//        for(int i=2; i<n+1; i++){
//            if(spf[i] = )
//            ans.add(spf.)
//        }

        return ans;
    }
    static int findFactors(int n){
        int ans = 1;
        return 5;
    }


}
class Jump{
    public static void main(String[] args) {
//        System.out.println(name);
    }
}
