package bank;

import java.util.*;

interface Bank {
    void assignLoans(int[] loans);
    void averageLoan();
    void maxLoan();
    void minLoan();
}
class PersonalLoanDept implements Bank {
    int[] loanAmounts;
    PersonalLoanDept(int clients) {
        loanAmounts = new int[clients];
    }
    public void assignLoans(int[] loans) {
        int limit = Math.min(loans.length, loanAmounts.length);
        for (int i = 0; i < limit; i++) {
            loanAmounts[i] = loans[i];
        }
        System.out.println("Loans for clients processed");
    }
    public void averageLoan() {
        int sum = 0;
        for (int loan : loanAmounts) {
            sum += loan;
        }
        double avg = (double) sum / loanAmounts.length;
        System.out.printf("Average loan amount for clients is %.2f\n", avg);
    }
    public void maxLoan() {
        int max = loanAmounts[0];
        for (int loan : loanAmounts) {
            if (loan > max) {
                max = loan;
            }
        }
        System.out.println("Maximum loan amount amongst clients is " + max);
    }

    public void minLoan() {

        int min = loanAmounts[0];

        for (int loan : loanAmounts) {
            if (loan < min) {
                min = loan;
            }
        }

        System.out.println("Minimum loan amount amongst clients is " + min);
    }
}

class BusinessLoanDept implements Bank {

    int[] loanAmounts;

    BusinessLoanDept(int businesses) {
        loanAmounts = new int[businesses];
    }

    public void assignLoans(int[] loans) {

        int limit = Math.min(loans.length, loanAmounts.length);

        for (int i = 0; i < limit; i++) {
            loanAmounts[i] = loans[i];
        }

        System.out.println("Loans for businesses processed");
    }

    public void averageLoan() {

        int sum = 0;

        for (int loan : loanAmounts) {
            sum += loan;
        }

        double avg = (double) sum / loanAmounts.length;

        System.out.printf("Average loan amount for businesses is %.2f\n", avg);
    }

    public void maxLoan() {

        int max = loanAmounts[0];

        for (int loan : loanAmounts) {
            if (loan > max) {
                max = loan;
            }
        }

        System.out.println("Maximum loan amongst businesses is " + max);
    }

    public void minLoan() {

        int min = loanAmounts[0];

        for (int loan : loanAmounts) {
            if (loan < min) {
                min = loan;
            }
        }

        System.out.println("Minimum loan amongst businesses is " + min);
    }
}
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int clients = sc.nextInt();
        int businesses = sc.nextInt();

        int[] clientLoans = new int[clients];
        int[] businessLoans = new int[businesses];

        for (int i = 0; i < clients; i++) {
            clientLoans[i] = sc.nextInt();
        }

        for (int i = 0; i < businesses; i++) {
            businessLoans[i] = sc.nextInt();
        }

        PersonalLoanDept personal = new PersonalLoanDept(clients);
        BusinessLoanDept business = new BusinessLoanDept(businesses);

        personal.assignLoans(clientLoans);
        business.assignLoans(businessLoans);

        personal.averageLoan();
        personal.maxLoan();
        personal.minLoan();

        business.averageLoan();
        business.maxLoan();
        business.minLoan();

        sc.close();
    }
}