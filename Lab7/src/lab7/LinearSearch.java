/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author 13476
 */
public class LinearSearch {
    public static int search(int arr[], int x){
        int n = arr.length;
        //iterate through the array
        for (int i = 0; i < n; i++) {
            //if the values match, return the index it's positioned at in the array
            if (arr[i] == x){
                return i;
            }
        }
        //if not found return zero
        return 0;
    }
}
// Todo 01: - complete the implementation of linear search and test your code
//          - prvoide asymptotic analysis of the developed solution
/*
The for loop will iterate through the array n times until x is found.
Since the growth of this funtion is liner,
the time complexity is O(n).
This function has a fixed values n and i,
so the space complexity is constant. 
*/

