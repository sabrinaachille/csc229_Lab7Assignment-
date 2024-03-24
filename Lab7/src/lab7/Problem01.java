/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author 13476
 */
public class Problem01 {
  public static long getSumOfPrimes(int n){
      //solution 1
      /*if(n%2==0){
           n-=1;
       }
       if(n<=1){
           return 1;
       }
       else{
           return n + getSumOfPrimes(n-2);
       }*/
      //solution 2
       int sum = 0;
       for (int i = 0; i <= n; i++) {
          if(i%2!=0){
              sum+=i;
          }
        }
       return sum;
    }   
}
// Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
//          Test your solution
//          Analyze its space and time  
/*
For solution 1, I bleieve the the time completexity shoudl be O(long n) because of the recursive call,
however the recurrence relation is decreasing by 2 so if I try to apply the master therom,
for T(n) = aT(n-b)+f(n), b = 2, but I'm not sure what a or f(n) would be.
For solution 2, the time complexity is linear becuase the loop interates n times,
so the time complexity is O(n).
Both both solutions, the space complexity is constant. 
*/