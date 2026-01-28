class Solution {
    public long solution(int n) {
        // n/2 -> 2가 최대로 들어갈 수 있는 수 = max
        // 2가 한번도 안쓰이는 경우 - 1 개
        // n이 1~max개 까지쓰이는 경우 
        // 3일때 0개는 1, 1개는 2 - 3
        // 4일때 0개는 1, 1개는 3 , 2 개는 1 - 5
        // 5일때 0개는 1, 1개는 4 , 2 개는 3 - 8
        // 6일때 0개는 1, 1개는 5 , 2 개는 6 , 3개는 1 - 13 
        // -> 피보나치..
        if (n == 1) return 1;
        if (n == 2) return 2;

        long dp1 = 1; 
        long dp2 = 2; 

        for (int i = 3; i <= n; i++) {
            long dp3 = (dp1 + dp2) % 1234567; 
            dp1 = dp2;
            dp2 = dp3;
        }

        return dp2;
    }
}