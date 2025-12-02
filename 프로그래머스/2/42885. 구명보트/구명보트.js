function solution(people, limit) {
    var answer = 0;
    var sum = 0;
    
    people.sort((a, b) => a - b);
    
    for (;;){
        var a = people[0];
        var b = people.pop();

        if(a + b <= limit){
            people.shift();
        }    
        answer++;
        if (people.length === 0) break;
    }
    return answer;
}