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

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int mynum = 0;
// while(mynum<=n){
//    if(mynum % 2==0){
//     System.out.println(mynum);
    
//    }
//    mynum++;
// }


//4. print sum of  n number
// Scanner sc = new Scanner(System.in);
// int number = sc.nextInt();

// int i = 0;
// int temp = 0;

// while(i<=number){
//     temp = temp+i;
//     i++;
// };
// System.out.println(temp);

//5. Print even numbers till N
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int x = 0;
// while (x<=n) {
//    System.out.println(x);
//    x= x+2;
// } 

//6. Print odd numbers till N
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int x = 1;
// while (x<=n) {
//     System.out.println(x);
//     x+=2;
// };


//7. Print N to 1 (reverse)

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int x = n;

// while(x>=1){
//     System.out.println(x);
//     x--;
// }

//8. Factorial no.
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int fact = 1, i = 1;
// while(i <= n) {
//     fact *= i;
//     i++;
// }
// System.out.println(fact);


//9. Print table of a number
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int a = 1;
// while(a<=){
    
//     System.out.println( n + " x " + a + " = " + (n*a) );
//     a++;

// }
 

//10. Count digits in a number
// Jab bhi hume traverse karna ho kisi bhi no. pe to hum condition mein n > 0 rakhenge aur n ko dhere dhere hume khatam krna hau to hum use 10 se divide krenge  
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int count = 0;
// while (n>0) {
//     count++;
//     n = n/10;
// }  
// System.out.println(count);



//11.Reverse a number
// Scanner10 sc = new Scanner(System.in);
// int n = sc.nextInt();
// int sum = 0;
// while (n>0) {
//     int ld = (n%10);
//     sum = sum * 10 + ld;
//     n = n/10;
// }
// System.out.println(sum);


//12. Sum of Digits(2346=> 2+3+4+6)
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// int sum = 0;
// int a = 0;
// while (a<=n) {
//     int ld = n%10;
//     sum = sum+ld;
//     n = n/10;
//     a++;
// }
// System.out.println(sum);


//13. Find product of digits of a number
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int product = 1;
// while (n>0) {
//     int ld = n% 10;
//     product = product * ld;
//     n =     n/10;
// }
// System.out.println(product);


// 14. Find factorial number ///  i  i k k * > <
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int a = 1;
// int fact = 1;
// while (a<=n) {
//     fact = fact * a; 
//     a++;
// }
// System.out.println(fact);


//15. Check if a number is a palindrome (e.g., 121 → Yes)

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int reversenum = n;
// int sum = 0;
// while (reversenum>0) {
//     int ld = reversenum% 10;
//     sum = sum * 10 + ld;
//   reversenum =   reversenum/10;
// }
// if (sum==n) {
//     System.out.println("Yes n is a palindrome number");
    
// }else{
//     System.out.println("No n is not palindrome number");
// }


//16. Count how many even digits are in a number
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int count = 0;
// while (n>0) {
//     int ld = n%10;
//     if (ld%2==0) {
//         count++;
//     }
//     n=n/10;
// }
// System.out.println(count);


//17. Count how many 0s are in a number
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int count = 0;
while (n>0) {
    int ld = n%10;
    if (ld==0) {
        count++;
    }
    n = n/10;
}
System.out.println(count);




 

















    }
}
