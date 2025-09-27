
    int n = arr.length; 
    int start = 0;
    int end = n-1;
    int square [] = new int [n];
    int idx = n-1;  
    while(end>=start){
        if(Math.abs(arr[start])> Math.abs(arr[end]) ){
            square[idx] = arr[start]*arr[start];
            idx--;
            start++;
        }
        if((Math.abs(arr[start])< Math.abs(arr[end]) )){
            square[idx] = arr[end]*arr[end]; 
            end--;
            idx--;
        }
        

    }