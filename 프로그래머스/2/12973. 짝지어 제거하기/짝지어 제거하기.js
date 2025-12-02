function solution(s)
{
    var stack = [s[0]];
    
    for (i=1; i<s.length; i++){
        if(s[i] === stack[stack.length -1]) {stack.pop()}
        else {stack.push(s[i])}
    }
    
    return stack.length > 0 ? 0 : 1;
}
//     효율성 테스트 통과 X
//     var arr = s.split("")
//     var i = 0;

//     while (i < arr.length) {
//         if (arr[i] === arr[i + 1]) {
//             arr.splice(i,2);
//             i = 0;
//         } else {
//             i++;
//         }
//     }
//     return arr.length > 0 ? 0 : 1;
