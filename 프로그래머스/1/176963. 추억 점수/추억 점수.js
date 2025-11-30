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
// return photo.map((v)=> v.reduce((a, c)=> a += yearning[name.indexOf(c)] ?? 0, 0))
// photo 를 맵으로 배열 가져오고
// 해당 배열을 reduce 함수로 축적
// name.indexOf(c) 여기서 c가 may, kein등 의 데이터 name의 인덱스 번호 가져오고
// 그 인덱스로 yearning 데이터 찾아서 축적 
// 없으면 논리 연산자 ?? 로 0 추가
// 