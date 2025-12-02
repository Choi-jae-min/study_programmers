function solution(brown, yellow) {
    var total = brown + yellow;
    var i = 1;
    var min = [];
    while (i <= total) {
      if (total % i === 0) min.push(i)
      i++
    }
    
    for (y=0; y<min.length; y++) {
        var a = min[y];
        var b = min[(min.length -1) -y]
        
        if(yellow === (a-2) * (b-2)){
            return [b,a];
        }
    }
}