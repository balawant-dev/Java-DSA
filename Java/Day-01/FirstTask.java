import java.util.Scanner;

public class FirstTask {
    //complete

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        sc.nextLine();   

        System.out.print("Enter Your Company Name: ");
        String companyName = sc.nextLine();

        System.out.println("\n----- Details -----");
        System.out.println("Welcome " + name);
        System.out.println("Age : " + age);
        System.out.println("Company : " + companyName);

        sc.close();
    }
}