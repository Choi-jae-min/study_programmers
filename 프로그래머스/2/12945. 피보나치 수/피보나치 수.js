function solution(n) {
    var answer = 1;
    var arr = [0,1]
    for(i=2; i<=n; i++){
        arr.push((arr[arr.length -1] + arr[arr.length -2]) % 1234567);
    }
    console.log(arr)
    return arr[arr.length -1];
}