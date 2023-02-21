
//Create a calculator using switch statement to perform addition, subtraction, multiplication and division.
import java.util.Scanner;
public class Q5 {

    public static void main(String[] args) {
        char op;
        Double num1;
        Double num2;
        Double sol;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter an operator:(+,-,* or /)");
        op = Sc.next().charAt(0);
        System.out.println("Enter first number:");
        num1=Sc.nextDouble();
        System.out.println("Enter second number:");
        num2=Sc.nextDouble();
switch (op){
    case'+':
        sol=num1+num2;
        System.out.println(num1+" + "+num2+" = "+sol);
        break;
    case'-':
        sol=num1-num2;
        System.out.println(num1+" - "+num2+" = "+sol);
        break;
    case'*':
        sol=num1*num2;
        System.out.println(num1+" * "+num2+" = "+sol);
        break;
    case'/':
        sol=num1/num2;
        System.out.println(num1+" / "+num2+" = "+sol);
        break;
    default:
        System.out.println("Error!The operator is not correct");
        break;
}

    }
}
