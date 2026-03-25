import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i< answer.length; i++){
            char c = s.charAt(i);
            
            if(!map.containsKey(c)){
                map.put(c,i);
                answer[i] = -1;
            }else{
                int index = map.get(c);
                answer[i] = i - index;

                map.put(c,i);
            }
        }
        
        return answer;
    }
}