class Solution {
    public String solution(String my_string) {
        // String answer = "";
        // for (String s : my_string.split("")){
        //     if(s.equals("e") || s.equals("a") || s.equals("i")
        //       || s.equals("o") || s.equals("u")){
        //         continue;
        //     }
        //     answer += s;
        // }
        String answer = "";

        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }
}