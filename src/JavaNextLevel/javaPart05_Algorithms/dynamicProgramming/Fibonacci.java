package JavaNextLevel.javaPart05_Algorithms.dynamicProgramming;

public class Fibonacci {

    public static void main(String[] args) {



    }


    //recursively
    static int fibo1(int n){
        if (n==0 || n==1)
            return 1;

        return fibo1(n-1) + fibo1(n-2);
    }

    //memoized
    static int fibo2(int n, Integer[] memo){
        if (memo[n]!=null) return memo[n];
        int result;
        if (n==1 || n==2) result = 1;
        else {
            result = fibo2(n - 1, memo) + fibo2(n - 2, memo);
            memo[n] = result;
        }
        return result;

    }

    //bottom-up
    static int fibo3(int n){
        if (n==1 || n==2) return 1;

        int[] bottom_up = new int[n+1];
        bottom_up[1] = 1;
        bottom_up[2] = 2;

        for (int i = 3; i < n+1; i++) {
            bottom_up[i] = bottom_up[i-1] + bottom_up[i-2];
        }

        return bottom_up[n];

    }


}
