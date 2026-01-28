class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        return Integer.valueOf(strA+strB) >= (2 * a * b) ? Integer.valueOf(strA+strB) : (2 * a * b);
    }
}