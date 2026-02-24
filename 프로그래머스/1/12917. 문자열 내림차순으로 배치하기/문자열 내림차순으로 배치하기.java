import java.util.*;
class Solution {
    public String solution(String s) {
        String[] s_list = s.split("");
        List<String> list = new ArrayList();
        for(String ss : s_list){
            list.add(ss);
        }
        Collections.sort(list,Collections.reverseOrder());
        System.out.print(list);
        String answer = "";
        for(String as : list){
            answer +=as;
        }
        return answer;
    }
}