class Solution {
    public int solution(int n, int k) {
        int preeDrink = n / 10;
        return (n * 12000) + ((k - preeDrink) * 2000);
    }
}