/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author 13476
 */
public class BubbleSort {
    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        //int count = 0; //for my understanding
        for (outer = size - 1; outer > 0; outer--) { // counting down
            //System.out.println("outer value: " + outer); //for my understanding 
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //compares the values at the current index to the next index
                //System.out.println("inner value: " + inner); //for my understand 
                if(a[inner]>a[inner+1]){
                    temp = a[inner+1];
                    a[inner+1]=a[inner];
                    a[inner]=temp;
                    //++count;
                }
            }
            //displays the new array and how many swaps occured (so I can visualize what happening)
            /*for(int i = 0; i < size; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println("number of swaps: " + count);*/
        }
        //dispaly the final sorted array 
        for(int i = 0; i < size; i++){
                System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
//ToDo 3: complete this algorithm, test it, provide its time complexity
/*
This function contains two loops that iterate through all elements in the array,
so the time complexity of this functio is O(n^2).
The space compelxity is constant because there is a fixed number of variables, outer, inner, and temp.
*/
