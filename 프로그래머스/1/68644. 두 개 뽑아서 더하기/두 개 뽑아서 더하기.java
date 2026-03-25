import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int a = numbers[i];
                int b = numbers[j];
                answer.add(a+b);
            }
        }
        return answer.stream().sorted() .mapToInt(Integer::intValue).toArray();
    }
}