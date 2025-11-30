function solution(name, yearning, photo) {
    var answer = new Array(photo.length);
    for (x = 0; x < photo.length; x++) {
        var num = 0
        // 여기서 모든 배열 한번씩 확인 photo[x][y]
        for (y = 0; y < photo[x].length; y++){
            
            for(z = 0; z < name.length; z++){
                if(photo[x][y] === name[z]){
                    num +=yearning[z];
                }
            }
        }
        answer[x] = num
    }
    return answer;
}