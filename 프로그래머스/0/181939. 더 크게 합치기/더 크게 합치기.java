class Solution {
    public int solution(int a, int b) {
        String A = String.valueOf(a) + String.valueOf(b);
        String B = String.valueOf(b) + String.valueOf(a);
        
        return Integer.parseInt(A) > Integer.parseInt(B) ? Integer.parseInt(A) : Integer.parseInt(B);
    }
}