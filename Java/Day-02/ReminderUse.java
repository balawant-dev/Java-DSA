import java.util.Scanner;
public class ReminderUse {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value Of A: ");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter value of B: ");
        int b=sc.nextInt();
        sc.nextLine();
        int module=a%b;
        System.out.println("Module of A and B :"+module);

    }
    
}
