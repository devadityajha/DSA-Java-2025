
import java.util.Arrays;


public class array {
    public static void main(String[] args) {




// Q.1  Two sum
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

// Q.2. Three sum
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


// Q3. Find the unique no. of array which is not repeated
int arr[] = {2, 4, 2, 5, 9, 7, 7, 5, 4};
for(int i = 0; i< arr.length; i++){
    for(int j = i+1; j< arr.length; j++){
        if( arr[i] == arr[j]  ){
            arr[i] = -1;
            arr[j] = -1;
        }

    }
}


int ans = -1;
for(int i = 0; i<arr.length; i++){
    if(arr[i] > 0 ){
        ans = arr[i];
    }
}
System.out.println(ans);















    }
}
