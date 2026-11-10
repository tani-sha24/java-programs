import java.util.*;
public class Arithmetic{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first operand:");
        int a= sc.nextInt();
        System.out.println("Enter second operand:");
        int b= sc.nextInt();
        System.out.println("Operator list:");
        System.out.println("1.Addition: +");
        System.out.println("2.Substarction: -");
        System.out.println("3.Multiplication: *");
        System.out.println("4.Division: /");
        System.out.println("5.Modulus: %");
        System.out.println("Please select your operator");
        int op= sc.nextInt();
        switch(op){
            case 1: 
            System.out.println(a+b); 
            break;
            case 2: 
            System.out.println(a-b);
            break;
            case 3: 
            System.out.println(a*b);
            break;
            case 4: 
            System.out.println(a/b);
            break;
            case 5: 
            System.out.println(a%b);
            break;
            default: 
            System.out.println("invalid choice");
        }
    }
}