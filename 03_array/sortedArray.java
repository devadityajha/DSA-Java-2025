import java.util.Arrays;

public class sortedArray{
    public static void main(String[] args){

// q1.  array is sort or not

// int arr[] = {2, 6, 7, 15, 20, 28};
// boolean issorted = true;
// Arrays.sort(arr);
// for(int i = 0; i<arr.length; i++){
//     if(arr[i]< arr[arr.length-1] ){
//         break;
//     }
//     issorted = false;
// }
// System.out.println(issorted);



// q. 2 find the maximum and minimum elment of array
int arr[]= {1, 4, 8, 0, 8, 9};
Arrays.sort(arr);
int newarray[] = {arr[0], arr[arr.length-1] };
System.out.println(Arrays.toString(newarray));































    }
}
