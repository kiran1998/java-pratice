package corejava;


import java.util.ArrayList;

public class JP_3_throw {
    public static void main(String[] args) {
//        System.out.println(checkPrime(100));
//        System.out.println(printPrimes(50));
        System.out.println(seivePrime(50));
    }
    static ArrayList<Integer> seivePrime(int n){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        boolean[] seive = new boolean[n+1];
        for(int i=1; i<n+1; i++){
            seive[i] = true;
        }

        for(int i=1; i<n+1; i++){
            if(checkPrime(i)) {
                for(int j=2*i; j<n+1; j+=i){
                    seive[j] = false;
                }
            }
        }

        for(int i=1; i<n+1; i++){
            if(seive[i] == true)
                ans.add(i);
        }
        return ans;
    }
    static ArrayList<Integer> printPrimes(int n){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=1; i<=n; i++){
            if(checkPrime(i))
                ans.add(i);
        }
        return ans;
    }
    static boolean checkPrime(int n){
        int c=0;
        for(int i=1; i*i<=n; i++){
            if(n%i == 0){
                if(i != n/i)
                    c+=2;
                else
                    c++;
            }
        }
        return c == 2;
    }

}

