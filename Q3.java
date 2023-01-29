import java.util.Scanner;

//- If the marks of Robert in three subjects are entered through keyboard (each out of
//100), write a program to calculate his total marks and percentage marks.
public class Q3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int number1=scn.nextInt();
        int number2=scn.nextInt();
        int number3=scn.nextInt();
        int total_numbers=number1 + number2 + number3;
        int percentage=(total_numbers/3);
        System.out.println(total_numbers);
        System.out.println(percentage +"%" );

    }
}
