class Solution {
    public int solution(int num) {
        final int FAIL = 0;
        final int MAX_TRY = -1;
        final int MAX_TRY_COUNT = 500;
        
        if(num == 1) return FAIL; 
        
        for(int i=0; i<MAX_TRY_COUNT; i++){
            if(num == 1){return i;}
            
            if(num % 2 == 0){
                num /= 2;
            }else if(num % 2 == 1){
                num *=3;
                num +=1;
            }
        }
        return MAX_TRY;
    }
}