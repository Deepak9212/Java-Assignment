import java.util.Scanner;

//Given two numbers, return their sum in the following format:
//Int t representing number of test cases
//T lines of Two integers representing the numbers to be added
public class Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 1; i <= t; i++) {
            int s = scn.nextInt();
            int o = scn.nextInt();
            System.out.println(s + o);
        }
    }
}
