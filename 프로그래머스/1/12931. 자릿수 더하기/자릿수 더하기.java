import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int Max_n = 100000000;
        
        // max 부터 나누면 가장 앞의 숫자만 나옴
        while(Max_n > 0){
            System.out.println(n / Max_n);
            int m = n / Max_n;
            if(m > 0){
                answer+=m;
                n -= m * Max_n;
            }
            Max_n /= 10;
        }
        
   
        return answer;
    }
}