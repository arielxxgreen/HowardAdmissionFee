/* Ariel Green
September 9th, 2023
 */
import java.util.Scanner;

public class HowardAdmissionFees {
    public static void main(String[] args) {
        int Salary = 50000;

        int regular_fees = 4050;
        int discounted_fees= 1050;
        double total_fees;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String student_name = scanner.nextLine();

        System.out.print("What is your state? ");
        String student_state = scanner.nextLine();

        System.out.print("What is your SAT score? ");
        int student_sat = scanner.nextInt();

        System.out.print("How many credits will you take this semester? ");
        int student_credit = scanner.nextInt();

        double credit_hour = 850.35;

        if (student_state.equalsIgnoreCase("DC") || student_sat > 1300){
            total_fees = student_credit * credit_hour + discounted_fees;
        } else {
            total_fees = student_credit * credit_hour + regular_fees;
        }

        System.out.println("Hi " + student_name + "your total fees for this semester is roughly: $ " + total_fees);

    }
}