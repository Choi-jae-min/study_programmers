function solution(k, tangerine) {
    var map = new Map();
    var answer = 1;
    for (i=0; i<tangerine.length; i++){
        var size = tangerine[i]
        if(!map.has(size)){
            map.set(size , 1);
        }else{
            var value = map.get(size) + 1;
            map.set(size, value)
        }
    }
    
    var arr = []
    map.forEach(v => {
        arr.push(v)
    })
    arr.sort((a,b) => b-a)
    var s=0;
    arr.forEach(v => {
        s+=v
        if (s < k){
            answer++
        }else{
            return answer;
        }
    })
    return answer;
}