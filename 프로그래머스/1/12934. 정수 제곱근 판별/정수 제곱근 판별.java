class Solution {
    public long solution(long n) {
        double x = Math.sqrt((double)n);
        
        if(x % 1 == 0.0){
            return (long)Math.pow((long)x +1, 2);
        }
        
        return -1;
    }
}