import java.util.Scanner;
public class ComparaisonOperators {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1=sc.nextInt();
        // sc.nextLine();
        System.out.print("Enter Second Number : ");
        int num2=sc.nextInt();
        // sc.nextLine();
        boolean  isEqual=(num1==num2);
        boolean firstIsGreater=(num1>num2);
        boolean firstIsSmaller=(num1<num2);

        System.out.println("Are Equal : "+isEqual);
        System.out.println("First is Greater : "+firstIsGreater );
        System.out.println("First is Smaller : "+firstIsSmaller);


    }
    
}
