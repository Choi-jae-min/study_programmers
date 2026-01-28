class Solution {
    public int solution(String my_string) {
        String[] strList = my_string.split("");
        int answer = 0;
        
        for(String s : strList){
            try{
                answer += Integer.parseInt(s);
            }catch(Exception e){
                continue;
            }
        }
        return answer;
    }
}