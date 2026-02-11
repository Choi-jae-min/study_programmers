class Solution {
    public long solution(long n) {
        String answer = "";
        
        String[] list = String.valueOf(n).split("");
        for(int i=0; i<=list.length-1; i++){
            for(int j=list.length-1; j > i; j--){
                if(Integer.valueOf(list[j]) > Integer.valueOf(list[j-1])){
                    String tmp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = tmp;
                }
            }
        }
        for(String s : list){
            answer += s;
        }
        return Long.valueOf(answer);
    }
}
