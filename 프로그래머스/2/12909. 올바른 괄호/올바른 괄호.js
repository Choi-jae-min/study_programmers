function solution(s){
    var arr = s.split('')
    var stack = [];
    
    arr.map((v) => {
        if(stack[stack.length -1] === `(` && v === `)` ){
            stack.pop()
        }else {
            stack.push(v)
        }
    })
    return stack.length === 0;
}