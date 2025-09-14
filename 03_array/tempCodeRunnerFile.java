
int nums[] = { 4, 4, 6, 7, 2};
int frequency [] = new int [100005];
boolean check = false;
for(int i = 0; i<nums.length; i++){
    frequency[nums[i]]++;
    if(frequency[nums[i]]  > 1 ){
        check = true;
        
    }

}
System.out.println(check);