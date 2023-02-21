// Write a program to print positive number entered by the user, if user enters a negative number, it is
//skipped.
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int N;
        System.out.println("enter the number:");
        N=Sc.nextInt();
        if(N>=0){

            System.out.println("your number is positive");
        }else{
            System.out.println("your number is negative and is skipped");
        }
    }
}
