import java.util.Scanner;

//- Given few lines of input(number of lines unknown) where each line has two
//strings, concatenate the strings.
public class Q5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(scn.hasNextLine()){
            String d=scn.next();
            String k=scn.next();
            System.out.println(d+k);
        }
    }
}
