import java.lang.Math;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        return Math.max(Integer.valueOf(strA+strB),  (2 * a * b));
    }
}