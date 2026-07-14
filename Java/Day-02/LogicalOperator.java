import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age=sc.nextInt();
        System.out.print("Has Voter ID : ");
        boolean voterId= sc.nextBoolean();
        boolean voteNow=(18<=age);
        boolean finalVoteNow=(voteNow&&voterId);
        System.out.println("Can Vote : "+finalVoteNow);

           System.out.println(true&&false);
              System.out.println(true||false);
                 System.out.println(!true);


                       System.out.println("===================Other problem1============");

                        int age1=17;
                 boolean voterId1=true;
                 boolean canVote=age1>=18&&voterId1;
                      boolean canVote2=age1>=18||voterId1;

                 System.out.println("Quation Answer:"+canVote);
                             System.out.println("Quation Answer2:"+canVote2);

                     System.out.println("===================Other problem2============");



        sc.close();


    }
    
}
