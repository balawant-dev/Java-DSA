import java.util.Scanner;
public class SecondTask {
    public static void main(String[]args){
        int x=5;
        System.out.println(x++);
        System.out.println(++x);

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int number1=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Second Number: ");
         int number2=sc.nextInt();
         sc.nextLine();

            System.out.println("\n----- Details -----");

            int addition=number1+number2;
            int subtration=number1-number2;
            int multiplication=number1*number2;
            double division=(double)number1/number2;
            int module=number1%number2;


                System.out.println("Addition = " + addition);
        System.out.println("Subtration = " + subtration);
        System.out.println("Multiplication : " + multiplication);
        System.out.println("Division = " +division);
        System.out.println("Module = "+module);




    }
    
}
