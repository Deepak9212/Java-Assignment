
//Write a program to print absolute value of a number entered by the user
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=Sc .nextInt();
        if(num<0){
            num=num*-1;
        }
        System.out.println("the absolute value is:"+" "+num);
    }
}
