function solution(n) {
    var n_oneCount_length = n.toString(2).replace(/0/g , '').length;

    for (;;) {
        n++
        if(n_oneCount_length ===  n.toString(2).replace(/0/g , '').length) break;
    }
    
    return n;
}