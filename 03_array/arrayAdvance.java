import java.util.Arrays;

public class arrayAdvance {
    public static void main(String[] args) {
       //// Q1.Print Array in reverse order
       
    //    int arr [] = {23, 45, 56, 67, 78, 89};
    //    for(int i = arr.length-1; i>=0; i--){
    //     System.out.println(arr[i]);
    //    }
      
       //// Q.2 Reverse the Array
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


        
        //// Q. 4 Rotate the array by k element 
        int arr[] = {23, 25, 16, 49, 93, 6, 8, 4};  //  expected output = 684, 23 25 16 49 93
        int k = 3;
        int n = arr.length;
        int x = n - k; // 5
// for non k items
        int start = 0;
        int end = x-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--; 
        }
// for k items
        int s = x;
        int e = n-1;
        while(s<e){
            int tem = arr[s];
            arr[s] = arr[e];
            arr[e] = tem;
            s++;
            e--;    
        }
// whole array
        int left = 0;
        int right = n-1;
        while(left<right){
            int te = arr[left];
            arr[left] = arr[right];
            arr[right] = te;
            left++;
            right--;
        }

        for(int i = 0; i< n; i++){
            System.out.println(arr[i]);
        }
       
        
//// Q.3 2 sum using 2 pointers
       











    }
}
