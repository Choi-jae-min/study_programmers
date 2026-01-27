import java.lang.Math;

class Solution {
    public int solution(int n) {
        double sqrt = Math.sqrt((double)n);
        
        return ((int)sqrt * (int)sqrt) == n ? 1 : 2;
    }
}