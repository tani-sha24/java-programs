import java.util.*;
public class vowel{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the alphabet:");
        String alpha = sc.nextLine();
        if (alpha == "a" && alpha =="e" && alpha=="i" && alpha=="o" && alpha=="u")
            System.out.println("Alphabet given is a vowel");
        else
            System.out.println("Alphabet given is a consonant");
        sc.close();
    }
}