function solution(n) {
    var answer = 0;
    for (i=1; i < n; i++){
        var sum = 0
        for (x=i; x < n ; x++){
            sum += x;
            if(sum === n) { 
                answer++
                break;
            }
            if(sum > n) {break;}
        }
        
    }
    return answer + 1;
}