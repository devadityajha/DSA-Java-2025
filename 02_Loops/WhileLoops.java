import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args) {
        


//1. Print n numbers till user input's number
    // Scanner sc = new Scanner(System.in);
    // int no = sc.nextInt();
    // int n = 0;
    // while(n<=no){
    //     System.out.println(n);
    //     n++;
    // }
    
//2. Print of first n umbers(mtlab jo no.user ne dala utne tak ka sum, 8= 1+2+3+4..+8)
//  Scanner sc = new Scanner(System.in);
//  int number = sc.nextInt();
//  int sum = 0;
//  int n = 1;
//  while(n<=number){
//     sum = sum + n;
//     n++;
// }
// System.out.println(sum);


//3. 🔢 Print even numbers from 1 to N

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int mynum = 0;
while(mynum<=n){
   if(mynum % 2==0){
    System.out.println(mynum);
    
   }
   mynum++;
}












    }
}