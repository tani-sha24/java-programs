import java.util.*;
public class Maths{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b  = sc.nextInt();
        System.out.println("Absolute Value: " + Math.abs(a)); 
        System.out.println("Find Maximum: " + Math.max(a,b));
        System.out.println("Circumference of a Circle: " + 2 * Math.PI * b); 
        System.out.println("Generate a Random Value: " + Math.random());
    }
}