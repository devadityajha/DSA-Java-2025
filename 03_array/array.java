
import java.util.Arrays;


public class array {
    public static void main(String[] args) {




/// Q.1  Two sum
// int arr [] = {4, 6, 9, 10, 5, 5};
//         int x = 10;

//         for(int i=0; i< arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i]+ arr[j]==x){
//                     int ans [] = {arr[i], arr[j]};
//                     System.out.println(Arrays.toString(ans));
//                 }
//             }
//         }

/// Q.2. Three sum
// int arr[] = {3, 4, 5, 12, 16, 8, 1};
// int x = 16;
// for(int i = 0; i<arr.length; i++){
//     for(int j = i+1; j<arr.length; j++){
//         for(int k = j+1; k<arr.length; k++){
//             if(arr[i]+ arr[j]+ arr[k]==x){
//                 int ans [] = {arr[i], arr[j], arr[k]};
//                 System.out.println(Arrays.toString(ans));
//             }
//         }
//     }
// }


/// Q3. Find the unique no. of array which is not repeated
// int arr[] = {2, 4, 2, 5, 9, 7, 7, 5, 4};
// for(int i = 0; i< arr.length; i++){
//     for(int j = i+1; j< arr.length; j++){
//         if( arr[i] == arr[j]  ){
//             arr[i] = -1;
//             arr[j] = -1;
//         }

//     }
// }


// int ans = -1;
// for(int i = 0; i<arr.length; i++){
//     if(arr[i] > 0 ){
//         ans = arr[i];
//     }
// }
// System.out.println(ans);







/// Q 4. Find the second element in the given array

// 1st APPROACH WITH INBUILT FUNCTION

// int arr [] = {4, 8, 0, 3, 2, 9, 7};
// Arrays.sort(arr);
// System.out.println(arr[arr.length-2]);


// 2ND APPROACH -- WITH 2 LOOPS with taking index of array- Not recommended

// int max = Integer.MIN_VALUE ;
// int iofmax= 0;
// for(int i = 0; i< arr.length; i++){
//     if( arr[i] > max   ){
//         max = arr[i];
//         iofmax = i;
        
//     }
// }

// int secondmax = Integer.MIN_VALUE;
// arr[iofmax] = Integer.MIN_VALUE;
// for(int i = 0; i< arr.length; i++){
    
//     if( arr[i] >  secondmax ){
//         secondmax = arr[i];
//     }
// }
// System.out.println(secondmax);


// 3RD APPROACH 2 loop without taking index of array
// best approach if you want to take 2 loops

// int arr [] = {4, 9, 0, 3, 2, 10, 11, 7};
// int max = Integer.MIN_VALUE;

// for(int i = 0; i<arr.length; i++){
//     if(  arr[i] > max   ){
//         max = arr[i];
//     }
// }
// // 2nd largest element
// int smax = Integer.MIN_VALUE;
// for(int i = 0; i< arr.length; i++){
//     if(arr[i]>smax  && arr[i] !=max  ){
//         smax = arr[i] ;
//     }
// }
// System.out.println(max);
// System.out.println(smax);


// 4th APPROACH WITH 1 LOOP--Ideal Approach

// int arr [] = { 5, 0, 3, 2, 1, 9, 7};

// int max = Integer.MIN_VALUE;
// int secondMax = Integer.MIN_VALUE;

// for (int i = 0; i < arr.length; i++) {
//     if (arr[i] > max) {
//         secondMax = max;
//         max = arr[i];
//     } 
//     else if (arr[i] > secondMax && arr[i] != max) {
//         secondMax = arr[i];
//     }
// };

// System.out.println(max);
// System.out.println(secondMax);
   


/// Q. 6 Find an array of integers return the first value that is repeating in the array;
// int arr [] = {  0, 3, 2, 4, 4, 10, 9, 7, };


// int repeat = -1;
// boolean found = false;

// for(int i = 0; i<arr.length; i++){
//     for(int j = i+1; j<arr.length; j++){
//         if(arr[i] == arr[j]){
//             repeat = arr[i];
//             found = true;
           
//             break;
//         }
//     }
//     if(found) break;
    
    
// }
// System.out.println(repeat);

// 2nd Approach  COMPLEXITY- (O(n log n))
int arr [] = {  0, 3, 2, 4, 4, 10, 9, 7, };
Arrays.sort(arr);
int repeat = -1;
for(int i = 1; i< arr.length; i++){
    if(arr[i] == arr[i-1]){
        repeat = arr[i];
    }
}
System.out.println(repeat);







    }
}
