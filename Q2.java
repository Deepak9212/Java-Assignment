import java.util.Scanner;

//- Swap two numbers without the use of third variable.
public class Q2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int a=scn.nextInt();
        System.out.println("Enter 2nd number");
        int b=scn.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
