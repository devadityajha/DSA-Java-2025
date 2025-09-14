import java.util.Arrays;
import java.util.*;

public class arrayAdvance {
    public static void main(String[] args) {
       //// Q.Print Array in reverse order
       
    //    int arr [] = {23, 45, 56, 67, 78, 89};
    //    for(int i = arr.length-1; i>=0; i--){
    //     System.out.println(arr[i]);
    //    }
      
       //// Q.1 Reverse the Array
    //    int arr [] = {23, 45, 65, 67, 79, 54, 90};
    //     int start = 0;
    //     int end = arr.length-1;
    //     while(start<end){
    //         int temp = arr[start];
    //         arr[start] = arr[end];
    //         arr[end] = temp;
    //         start++;
    //         end--;

    //     }
    //     for(int i =0; i<arr.length; i++){
    //         System.out.println(arr[i]);
    //     }


        
        //// Q. 2 Rotate the array by k element to the right 
//         int arr[] = {23, 25, 16, 49, 93, 6, 8, 4};  //  expected output = 684, 23 25 16 49 93
//         int k = 3;
//         int n = arr.length;
//         int x = n - k; // 5
// // for non k items
//         int start = 0;
//         int end = x-1;
//         while(start<end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--; 
//         }
// // for k items
//         int s = x;
//         int e = n-1;
//         while(s<e){
//             int tem = arr[s];
//             arr[s] = arr[e];
//             arr[e] = tem;
//             s++;
//             e--;    
//         }
// // whole array
//         int left = 0;
//         int right = n-1;
//         while(left<right){
//             int te = arr[left];
//             arr[left] = arr[right];
//             arr[right] = te;
//             left++;
//             right--;
//         }

//         for(int i = 0; i< n; i++){
//             System.out.println(arr[i]);
//         }


            
//// Q. 3 Given an array and multiple queries (l, r), find the sum of elements between indices l and r (inclusive).

// int arr [] = {2, 4, 1, 3, 4, 6, 10};
// int n = arr.length;
// int prefix [] = new int[n];
// prefix [0] = arr[0];

// for(int i = 1; i< n; i++){
//      prefix[i] = prefix[i-1] + arr[i];

// }
// int l = 3;
// int r = 6;
// int sum = prefix[r] - prefix[l-1];
// System.out.println(sum);



// //// Q.4 Two Sum in Sorted Array using 2 pointers
//        int arr [] = {2, 4, 1, 3, 4, 6, 10};
//        int x = 10;
//        Arrays.sort(arr);
//        int n = arr.length;
//        int start = 0;
//        int end = n-1;
//        while(start<end){
// int sum = arr[start] + arr[end];
// if(sum==x){
//     System.out.println( arr[start] +   " + " + arr[end] + " = " + x );
//     break;
// }else if(sum>x){
//     end--;
// }else{
//     start++;
// };
// };            
  
      
//// Q. 5 Check if number is present in array or not  --Optimized approach
/// Approach name: Direct Indexing (Presence Array)
// int arr [] = {3, 5, 8, 2, 9, 2, 8, 44, 32};
// int q = 3;
// int queries [] = {2, 4, 3};
// int freq [] = new int [1000005];
// for(int i = 0; i< arr.length; i++){
//     freq[arr[i]]++;
// }                  

// for(int i = 0; i< q; i++){
//     int x = queries[i];
//     if(freq[x]>0){
//         System.out.println("Yes  " + x + " is present");
//     }else{
//         System.out.println("no");
//     }
// }


//// Q. 6 Find the element that occurs the most (mode of array)
///   Approach name: Direct Indexing (Presence Array)

// int arr [] = {300, 5, 8, 2, 9, 2,8, 44, 3,3, 32};

// int count[] = new int [100005];

// for(int i = 0; i<arr.length; i++){
//     count[arr[i]]++;
// };
// int maxelement = arr[0];
// int maxcount = count[arr[0]] ;
// for(int i = 1; i<arr.length; i++){
//     // int element = arr[i];
//     if(count[arr[i]] > maxcount ){
//         maxcount= count[arr[i]] ;
//         maxelement = arr[i];
//     }
// }

// System.out.println(maxcount);
// System.out.println(maxelement);


//// Q. 7 Find all duplicates in the array


// int arr [] = {2, 3, 4, 4, };
// int count [] = new int [100005];

// for(int i = 0; i<arr.length; i++){
//     count[arr[i]]++;
// }

// for(int i =0; i<count.length; i++){
  
//     if(count[i] >= 2 ){
//         System.out.println(i);
//     }
// }






// Q. 8 Find duplicate elements in array-- only one duplicate 

// int arr [] = {2, 3, 5, 7, 7 };
// int n = arr.length;

// int frequency [] = new int [10005];
// for(int i = 0; i< n; i++){
// frequency[arr[i]]++;
// }

// for(int i =0; i<frequency.length; i++){
  
//     if(frequency[i] >= 2 ){
//         System.out.println(i);
//     }
// }



// Q. 9 Contains Duplicate (boolean/hashset)
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// int nums[] = { 4, 4, 6, 7, 2};
// int frequency [] = new int [100005];
// boolean check = false;
// for(int i = 0; i<nums.length; i++){
//     frequency[nums[i]]++;
//     if(frequency[nums[i]]  > 1 ){
//         check = true;
        
//     }
    
// }
// System.out.println(check);



// Q. 10 Missing Number (presence/frequency + sum/XOR optimized)---- LC 268---But not  optimized approach

// int nums [] = {2, 3,0, 1};
// int n = nums.length;
// boolean present [] = new boolean [n+1];
// for(int i =0; i< n; i++){
// present[nums[i]] = true; 
// }

// for(int i = 0; i< n+1; i++){
// if(!present[i]){
//     System.out.println(i);
// }
// }




// Q. 11 Find All Numbers Disappeared in an Array----LC 448-- But not optimized approach

// int nums [] = {2, 3, 3, 4,5,6,4,8};
// List <Integer>  result = new  ArrayList<>(); 
// int n=  nums.length;
// boolean present []= new boolean [n+1];

// for(int i = 0; i< nums.length; i++){
//     present[nums[i]] = true;
// }

// for(int i =1; i< n+1; i++){
//     if(!present[i]  ){
//         result.add(i);
//     }
// }
// System.out.println(result);  



// LC 217 – Contains Duplicate (boolean/hashset) done
// LC 268 – Missing Number (presence/frequency + sum/XOR optimized) done
// LC 448 – Find Disappeared Numbers (boolean + negation trick) done
// LC 347 – Top K Frequent Elements (frequency + heap) 
// LC 169 – Majority Element → frequency / Boyer-Moore.





    }
}
