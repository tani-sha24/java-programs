import java.util.*;
public class Sqaure{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides:");
        int s= sc.nextInt();
        System.out.println("Area of the sqaure is: " + s*s );
        System.out.println("Perimeter of square is: " + 4*s);
    }
}