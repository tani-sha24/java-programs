import java.util.*;
public class Comparison1{
    public static void main(Strings [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int a= sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        if (a >= b && a >= c)
            System.out.println(a + " is larger than both " + b + " and " + c);
        else if (b >= a && b >= c)
            System.out.println(b + " is larger than both " + a + " and " + c);
        else
            System.out.println(c + " is larger than both " + a + " and " + b);
        sc.close();
    }
} 