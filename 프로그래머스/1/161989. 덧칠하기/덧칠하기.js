function solution(n, m, section) {
    var answer = 0;
    var last = 0;
    section.map((v) => {
        if(last < v){
           answer++
           last = v + ( m-1 );
       }
    })
    return answer;
}