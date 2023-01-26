package LeetCodeProgramsDSA;

import java.util.HashSet;
public class Que202 {
    public int sumOfSquares(int n){
        int sum =0,r;
        while(n!=0)
        {
            r=n%10;
            sum+=r*r;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();
        int sum=0;
        while(sum!=1){
           sum = sumOfSquares(n);
            if(set.contains(sum)){
                return false;
            }
            else
                set.add(sum);
            
            n=sum;
        }
        return true;
    }
    public static void main(String[] args) {
        Que202 obj = new Que202();
        System.out.println(obj.isHappy(82));
    }
}
