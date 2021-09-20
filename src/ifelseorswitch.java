import java.util.Scanner;

public class ifelseorswitch {



        public static void main(String[] args) {
            int age;
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();
            switch (age){
                case 18:
                    System.out.println("ADULT");
                    break;
                case 21:
                    System.out.println("JOB");
                    break;
                case 60:
                    System.out.println("RETIRE");
                    break;
                default:
                    System.out.println("exit");
            }
            if (age > 66) {
                System.out.println("You are Expreinced");

            } else if (age > 55) {
                System.out.println("you are semi experience");
            } else {
                System.out.println("you are not experience");
            }
        }
    }



