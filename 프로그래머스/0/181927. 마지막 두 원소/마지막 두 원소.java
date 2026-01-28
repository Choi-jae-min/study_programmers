class Solution {
    public int[] solution(int[] num_list) {
        int num1 = num_list[num_list.length-1];
        int num2 = num_list[num_list.length -2];
        
        int lastIdx = num1 > num2 ? num1 - num2 : num1 * 2;
        int[] answer = new int[num_list.length +1];
        for (int i=0; i<= num_list.length -1; i++){
            answer[i] = num_list[i];
        }
        answer[answer.length-1] = lastIdx;
        return answer;
    }
}