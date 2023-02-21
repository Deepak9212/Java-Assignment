
// Write a program which takes the values of length and breadth from user and check if it is a square or not.
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length;
        System.out.println("put the length");
        length=sc.nextInt();
        Scanner Sc=new Scanner(System.in);
        int breadth;
        System.out.println("put the breadth");
        breadth=sc.nextInt();
        if(length == breadth){
            System.out.println("it is a square");
        }else{
            System.out.println("it is not a square");
        }
    }
}
