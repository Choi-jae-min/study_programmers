class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_a = 0;
        int max_b = 0;
        for(int[] size: sizes){
            int a = size[0];
            int b = size[1];
            if(size[0] < size[1]){
                a = size[1];
                b = size[0];
            }
            
            if(a > max_a){
                max_a = a;
            }
            if(b > max_b){
                max_b = b;
            }
          
        }
        return max_a * max_b;
    }
}