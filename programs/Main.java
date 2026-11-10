import java.util.*;
class Student{
    int rollno;
    String name;
    void getData(Scanner sc) {
        System.out.println("Enter the roll no:");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        name = sc.nextLine();
    }
    void displayData(){
        System.out.println("Roll No. :" + rollno);
        System.out.println("Name :" + name);
    }
}
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Enter details of Student 1:");
        s1.getData(sc);
        System.out.println("\nEnter details of Student 2:");
        s2.getData(sc);
        System.out.println("\nStudent 1 Details:");
        s1.displayData();
        System.out.println("\nStudent 2 Details:");
        s2.displayData();
        sc.close();
    }
}
    