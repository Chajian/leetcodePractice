package interview;

import org.junit.Test;
import tools.Prime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class a30 {

    public List<Integer> findSubstring(String s, String[] words) {
        List list = new ArrayList();
        List<Integer> nums = primes(26);
        StringBuilder wordsBuilder = new StringBuilder();
        for(String s1:words){
            wordsBuilder.append(s1);
        }
        long wordsNum = StringtoLongByAdd(nums,wordsBuilder.toString());
        long wordsMul = StringtoLongByMultiply(nums,wordsBuilder.toString());
        int i = 0,j=0,wordlen = words[0].length(),wordslen = wordlen*words.length;
        long tempNums = 0,tempMul = 1;
        while(i<=s.length()-wordslen) {
            if((j-i) < wordslen) {
                tempNums += nums.get(s.charAt(j) - 'a');
                tempMul *= nums.get(s.charAt(j) - 'a');
                j++;
            }
            else{
                if(tempNums==wordsNum&&tempMul==wordsMul){
                    list.add(i);
                }
                tempMul /= nums.get(s.charAt(i) - 'a');
                tempNums -= nums.get(s.charAt(i) - 'a');
                i++;
            }
        }
        return list;
    }

    public static List primes(int times){
        int count = 0;
        int n = 2;
        List list = new ArrayList();
        while(count<times){
            if(n%2!=0&&n%3!=0) {
                list.add(n);
                count++;
            }
            n++;
        }
        return list;
    }

    public static long StringtoLongByAdd(List<Integer> nums,String a){
        long l = 0;
        for(char c:a.toCharArray()){
            l+= (long)nums.get((c-'a'));
        }
        return l;
    }

    public static long StringtoLongByMultiply(List<Integer> nums,String a){
        long l = 1;
        for(char c:a.toCharArray()){
            l*= (long)nums.get((c-'a'));
        }
        return l;
    }


    @Test
    public void test(){
        System.out.println(Arrays.toString(findSubstring("aaaaaaaaaaaaaa",new String[]{"aa","aa"}).toArray()));
    }
}
