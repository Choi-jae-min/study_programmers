class Solution {
    public int solution(int num1, int num2) {
        double double_num1 = num1;
        double double_num2 = num2;
        double answer = (double_num1/double_num2) * 1000;
        return (int)answer;
    }
}