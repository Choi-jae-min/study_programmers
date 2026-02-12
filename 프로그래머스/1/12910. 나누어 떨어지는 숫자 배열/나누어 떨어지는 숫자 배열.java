import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for(int n : arr){
            if(n%divisor == 0){
                list.add(n);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        Collections.sort(list);
        return list;
    }
}