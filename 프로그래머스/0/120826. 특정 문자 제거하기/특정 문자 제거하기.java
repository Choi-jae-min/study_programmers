class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        String[] list = my_string.split("");
        for (String s : list){
            if(s.equals(letter)){
                continue;
            }
            answer += s;
        }
        return answer;
    }
}