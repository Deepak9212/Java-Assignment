// Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit or loss
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int cp;
        int sp;
        System.out.println("enter the cost price:");
        cp=Sc.nextInt();
        System.out.println("enter the selling price");
        sp=Sc.nextInt();
        int result ;
        if(cp>sp)
        {
            result=cp-sp;
            System.out.println("the loss is :"+result);
        }else if(sp>cp){
            result=sp-cp;
            System.out.println("the profit is:"+result);
        }else{
            System.out.println("no profit no loss");
        }
    }
}
