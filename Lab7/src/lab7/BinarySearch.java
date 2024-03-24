/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author 13476
 */
public class BinarySearch {
    
public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
//ToDo 2: Call the above method and test the algorithm
//        provide time and space analysis
/*
This function searches thorugh the sorted array by calculating the mid position of the array
and comparing the mid position value to the key value our prgram is checking for.
If the mid position value is less or greater than the key value,
the search will be reduced to half the array size until the key value is found. 
Because the search is reduced by half the time analysis for this fucntion is T(n)=O(log n).
For this function, there are a fixed number of variables, low, high, mid, index,
so the space complexity of this fucntions is constant.
*/
