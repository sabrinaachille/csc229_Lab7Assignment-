/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7;

import static lab7.BinarySearch.runBinarySearchIteratively;
import static lab7.LinearSearch.search;
import static lab7.BubbleSort.bubbleSort;
import static lab7.Problem01.getSumOfPrimes;

/**
 *
 * @author 13476
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1
        int arr1 [] = {8,4,7,5,6,3,2};
        System.out.println(search(arr1, 3));
        //TODO 2
        int arr2 [] = {2,4,6,8,10,12,14};
        System.out.println(runBinarySearchIteratively(arr2, 10, 0, 6));
        //TODO 3
        int arr3 [] = {5,4,3,2,1};
        bubbleSort(arr3, arr3.length);
        ///TODO 4
        System.out.println(getSumOfPrimes(1));
    }
    
}
