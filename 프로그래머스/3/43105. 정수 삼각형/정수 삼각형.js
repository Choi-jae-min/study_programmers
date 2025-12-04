function solution(triangle) {
    var dp = Array.from({ length: triangle.length },
                        (_, i) => Array(triangle[i].length).fill(0));
    
    dp[0][0] = triangle[0][0];
    
     for (i=1; i < triangle.length; i++){
         for(y=0; y < triangle[i].length; y++){
             if(y===0){
                dp[i][y] = triangle[i][y] + dp[i-1][y]
             }else if(y === i){
                dp[i][y] = triangle[i][y] + dp[i-1][y-1]
             } else {
                dp[i][y] = Math.max(dp[i-1][y-1], dp[i-1][y]) + triangle[i][y];
             }
         }
     }
    
    return Math.max(...dp[triangle.length - 1]);;
}    


// 2치 시간초과
// function solution(triangle) {
//     var dp = Array.from({ length: triangle.length },
//                         (_, i) => Array(triangle[i].length).fill(0));
//     dp[0][0] = triangle[0][0];
//      for (i=1; i < triangle.length; i++){
//          for(y=0; y < triangle[i].length; y++){
//              if(y===0){
//                 dp[i][y] = triangle[i][y] + dp[i-1][y]
//              }else if(y === i){
//                 dp[i][y] = triangle[i][y] + dp[i-1][y-1]
//              } else {
//                 dp[i][y] = Math.max(dp[i-1][y-1], dp[i-1][y]) + triangle[i][y];
//              }
//          }
//      }
//     return Math.max(...dp[triangle.length - 1]);;
// }  


//1 차 
//     var dp = Array.from({length :triangle.length}, () => new Set());
//     dp[0].add(triangle[0][0]);
//     for (i=1; i < triangle.length; i++){
//         for (y=0; y<triangle[i].length; y++){
//             for(var a of dp[i-1]){
//                 if(y === 0) {
//                     dp[i].add(a + triangle[i][y])
//                 }else if(y < triangle[i].length-1){
//                     dp[i].add(a + triangle[i][y-1])
//                     dp[i].add(a + triangle[i][y])
//                 }else {
//                     dp[i].add(a + triangle[i][y])
//                 }
//         }
//         } 
//     }

