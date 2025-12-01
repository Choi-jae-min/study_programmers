function solution(s) {
    var tmp = 0;
    var removed_zero = 0;
    var result =s
    while(true){
        tmp++;
        var a = result.replace(/0/g, '');
        removed_zero += result.length - a.length
        result = a.length.toString(2)
        
        if(result.length.toString(2) === "1") break;
    }
    
    return [tmp , removed_zero];
}