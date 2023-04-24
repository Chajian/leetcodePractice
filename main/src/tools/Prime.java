package tools;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * generate Prime tool
 */
public class Prime {
    public static List prime(int n){
        List<Integer> primes = new ArrayList();
        while(n-->0){
            if(n%2!=0&&n%3!=0)
                primes.add(n);
        }
        return  primes;
    }

}
