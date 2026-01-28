class Solution {
    public int solution(int price) {
        int answer = price;
        
        if(price >= 500_000){
             answer -= price * 0.2;
        }
        else if(price >= 300_000){
             answer -= price * 0.1;
        }
        else if(price >= 100_000){
             answer -= price * 0.05;
        }
        return answer;
    }
}