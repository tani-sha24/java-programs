import java.util.*;
public class Rectangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        System.out.println("Area of the rectangle is: " + l*b);
        System.out.println("Perimeter of rectangle is: " + 2*(l+b));
    }
}