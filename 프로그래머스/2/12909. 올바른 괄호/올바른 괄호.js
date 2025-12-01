function solution(s){
    var arr = s.split('')
    var stack = [];
    
    // if(arr[0] === `)` || arr[arr.length -1] === `(`){
    //     return false;
    // }
    arr.map((v) => {
        if(stack[stack.length -1] === `(` && v === `)` ){
            stack.pop()
        }else {
            stack.push(v)
        }
    })
    console.log(stack)
    return stack.length === 0;
}