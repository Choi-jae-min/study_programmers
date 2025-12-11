function solution(arr) {
    arr.sort((a,b)=>a-b);
    let times = 1;
    while (true){
        for (i=0; i < arr.length; i++){
            const n = arr[i] * times;
            let a = 0
            for (j=0; j< arr.length; j++){
                if(n % arr[j] !== 0){break;}
                a = arr[j]
            }
            if (a === arr[arr.length -1]) {
                return n
            }
        }
        times++;
    }
}