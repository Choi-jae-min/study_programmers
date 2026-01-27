class Solution {
    public double solution(int[] numbers) {
        int answer = 0;
        for(int number : numbers){
            answer += number;
        }
        return (double)answer / (numbers.length);
    }
}