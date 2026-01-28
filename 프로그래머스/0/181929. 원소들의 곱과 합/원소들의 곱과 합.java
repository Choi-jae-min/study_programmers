class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multi = 1;
        for(int n : num_list){
            sum += n;
            multi *= n;
        }
        
        int answer = 0;
        return sum * sum > multi ? 1 : 0;
    }
}