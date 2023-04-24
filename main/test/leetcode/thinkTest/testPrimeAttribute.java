package leetcode.thinkTest;

import org.junit.Test;
import tools.Prime;

import java.util.Arrays;
import java.util.List;

public class testPrimeAttribute {






    @Test
    public void test(){
        List list = Prime.primes(27);
        String a ="acacacvnvnvnsdfasdzzzzzzz";
        String b ="dsafdsnvnvnvcacacazzzzzzzzzzzzzzzzz";
        long aa=0,bb=0;
        aa = Prime.StringtoLongByMultiply(list,a);
        bb = Prime.StringtoLongByMultiply(list,b);
        System.out.println("a:"+aa+"\n"+"b:"+bb);

        System.out.println(Arrays.toString(list.toArray()));
    }



}
