import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        
//1. 
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter your age");
// int age = sc.nextInt();
// if (age>18) {
//     System.out.println("You can give vote");
// }else{
//     System.out.println("Sorry bda ho ja pehle");
// }


//2. Even or Odd
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number");
// int num = sc.nextInt();
// if(num%2==0){
// System.out.println("This number is even");
// }else{
// System.out.println("The number is odd");
// }


//3. Positive, Negative or Zero
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number to know its positive negative or zero");
// int num = sc.nextInt();
// if(num>0){
//     System.out.println("no. is positive");
// }else if(num<0){
//     System.out.println("number is negative");
// }else{
//     System.out.println("zero");
// }


//4. Maximum of Two Numbers
// Scanner sc = new Scanner(System.in);
// System.out.println("CHeck no.which one is greater");
// int numA = sc.nextInt();
// int numB = sc.nextInt();
// if(numA>numB){ 
//     System.out.println(numA + " is greator than " + numB);
// }
// else if(numB>numA){
//     System.out.println(numB + " is greator than " + numA);
// }
// else{
//     System.out.println("Number cant be calculate");
// }

//5. Divisible by 5 and 11
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// if(num%5==0 && num%11==0){
//     System.out.println("no.is divisible by 5 & 11 both");
// }
// else{
//     System.out.println("Number is not divisible by both");
// }

//6. Character is Vowel or Consonant
// Scanner sc = new Scanner(System.in);
// String alphabet = sc.nextLine();
// if(alphabet.equalsIgnoreCase("a") || alphabet.equalsIgnoreCase("e") || alphabet.equalsIgnoreCase("i") || alphabet.equalsIgnoreCase("o") || alphabet.equalsIgnoreCase("u")){
//     System.out.println("Its a vowel");
// }else{
//     System.out.println("Its a constant");
// }


//7. Grade Calculator
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter your percentage");
// int percentage = sc.nextInt();
// if (percentage >= 90) {
//     System.out.println("A+");
// }else if(percentage<=89 && percentage >= 80 ){
// System.out.println("B");
// }else if(percentage >= 70 && percentage <= 79){
// System.out.println("C");
// }else if(percentage <= 69 && percentage >= 40){
//     System.out.println("D");
// }else if(percentage < 40){
//     System.out.println("Fail");
// }
// else{
//     System.out.println("not applicable");
// }

//8. Check if Character is Alphabet, Digit or Special Symbol
// Scanner sc = new Scanner(System.in);
// char charac = sc.next().charAt(0);
// if(Character.isLetter(charac)){
//     System.out.println("Character is letter");
// }else if(Character.isDigit(charac)){
//     System.out.println("Character is digit");
// }
// else{
//     System.out.println("Character is a special character");
// }

//8. Repeat upar wala
// Scanner sc = new Scanner(System.in);
// char charac = sc.next().charAt(0);
// if(Character.isLetter(charac)){
//     System.out.println("Character is letter");
// }else if(Character.isDigit(charac)){
//     System.out.println("Character is digit");
// }else{
//     System.out.println("Character is special character ");
// }

//9. If else as teranary operator
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// String ans = (num % 2 == 0) ?  "even" : "odd";

// System.out.println(ans);

//10. input should be divisble from 3 and even

Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
if(num % 2 == 0 && num % 3 == 0){
    System.out.println("It is divisble by 3 and even");
}else{
    System.out.println("Not divisible");
}










    }
}
