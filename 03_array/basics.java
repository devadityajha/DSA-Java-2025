public class basics {

    public static void main(String[] args) {

// q1. find the max element in array
    //     int arr[] = {1, 5, 4};
    //     int sum = 0; 
    //     for(int i = 0; i<arr.length; i++){
    //         sum = sum + arr[i];
        
    //     }
    //     System.out.println(sum);
     
// q2.  search the given element x in array. If present then rturn the index else return -1
int arr[] = {1, 5, 3, 10, 12, 4};
int x = 13;
int output = -1;
for(int i = 0; i<arr.length; i++){
   if( arr[i] == x) {
    output = i;
}
}
System.out.println(output);



























































































}
}