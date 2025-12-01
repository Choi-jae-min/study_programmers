function solution(s) {
    var arr = s.split('');
    var answer = arr[0].toUpperCase();
    arr.map((c,index) => {
        if(index > 0){
            answer += arr[index -1] == ' ' ? c.toUpperCase() : c.toLowerCase();
        }
    })
// 공백 때문에 1개 만 틀림;;
//     var arr = s.split(' ')
//     var answer = '';
    
//     arr.map((v) => {
//         answer += v.charAt(0).toUpperCase() + v.slice(1).toLowerCase() + ' '
//     })
    return answer;
}