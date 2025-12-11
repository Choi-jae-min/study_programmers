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
// function gcd(a, b) { // 최대 공약수
//     return b === 0 ? a : gcd(b, a % b);
// }

// function lcm(a, b) { // 최대 공배수
//     return (a * b) / gcd(a, b);
// }

// function solution(arr) {
//     return arr.reduce((acc, cur) => lcm(acc, cur));
// }
