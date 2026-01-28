import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        // n % 2 == 1이면. 1걸음 더 가서 2배를 해야 딱 떨어지는 숫자가 나옴.
        // 5000의 도달하기 위해 베스트는 2500을 만드는것,
        // 2500은 1250을 만드는것, 이렇게 하다보면
        // 625 --> 624걸음에서 1걸음 추가하면 나옴
        
        while(n >= 1){ // n이 0이 될때까지 반복
            if(n % 2 ==1){ //2로 나누어 지지 않으면 1걸음 추가
                ans++;
                n--;
            }
            n = n/2;
        }
        return ans;
    }
}