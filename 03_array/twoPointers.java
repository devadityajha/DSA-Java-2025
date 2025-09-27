import java.util.*;
import java.lang.Math;
public class twoPointers {
public static void main(String[] args) {
    // q. 1 Sort an array consisting of only 0s and 1s 
    
    // q. 1 Squares of a Sorted Array(non decreasing array)--- lc 977

//     int arr [] = { -10, -3, -2, 1, 4, 5};

//     int n = arr.length; 
//     int start = 0;
//     int end = n-1;
//     int square [] = new int [n];
//     int idx = n-1;  
//     while(end>=start){
//         if(Math.abs(arr[start])> Math.abs(arr[end]) ){
//             square[idx] = arr[start]*arr[start];
//             idx--;
//             start++;
//         }
//         if((Math.abs(arr[start])< Math.abs(arr[end]) )){
//             square[idx] = arr[end]*arr[end]; 
//             end--;
//             idx--;
//         }
        

//     }


// System.out.println(Arrays.toString(square));


// q. 2 Remove Duplicates from Sorted Array-- lc 26
// int nums [] = {2, 2, 4, 5, 5, 5, 6, 6, 9};
// int n = nums.length;
// int i = 0;
// for(int j = 1; j<n; j++){
//    if(nums[i] != nums[j]){
//     i++;
//     nums[i] = nums[j];
//    }
// }
// System.out.println(i+1);
// System.out.println(Arrays.toString(Arrays.copyOf(nums, i+1))); // if want to take new array with limit of index like bass 5th index tak hi lena ho to


    
// Q. 3 Remove Element-- LC 27
int nums [] = {2, 3, 4, 7, 2, 6, 12, 45};
int val = 2;
int n = nums.length;
int i = 0; // slow pointer: next write position for valid element
        for (int j = 0; j < n; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        System.out.println("New length (count of elements != " + val + "): " + i);

// Q. 4 Sort Colors -- lc 75
int nums [] = {2, 0,1, 2, 0,1, 2};

        

// q2. q. 1 Sort an array consisting of only 0s and 1s 
// q3. sort an array place all even integers then odd 
// lc 283
// lc 977
// lc 905




}
}
