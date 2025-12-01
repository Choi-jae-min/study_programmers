function solution(s) {
    arr = s.split(' ');
    var answer = `${Math.min.apply(null, arr)} ${Math.max.apply(null, arr)}`
    return answer;
}