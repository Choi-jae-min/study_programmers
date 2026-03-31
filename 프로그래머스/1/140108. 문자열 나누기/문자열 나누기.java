import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] s_list = s.split("");
        String x = "";
        int cnt1 = 0;
        int cnt2 = 0;
        for(String n : s_list){
            if(x.equals("")){
                x = n;
                cnt1++;    
            }else if(n.equals(x) ){
                cnt1++;
            }else {
                cnt2++;                
            }
            
            if(cnt1 == cnt2){
                answer++;
                x = "";
                cnt1 = 0;
                cnt2 = 0;
            }
        }
        
        if (cnt1 != 0) answer++;
        
        return answer;
    }
}