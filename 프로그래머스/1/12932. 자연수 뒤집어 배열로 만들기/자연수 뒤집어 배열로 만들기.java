import java.util.*;

class Solution {
    public List<Integer> solution(long n) {
        String[] s = String.valueOf(n).split("");
        List<Integer> list = new ArrayList<>();
        
        for(int i = s.length-1; i>=0; i--){
            list.add(Integer.valueOf(s[i]));
        }
        
        return list;
    }
}
