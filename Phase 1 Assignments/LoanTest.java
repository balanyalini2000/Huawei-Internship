package loantest;

import static java.lang.Math.pow;
import java.util.Scanner;

//Parent class
class Bank
{
    int loanType;
    double loanAmt;
    double EMI;
    int tenure;
    
    void emiCalculation(double p, double r)
    {
      //Assuming tenure (in years) based on the loan amount
      if(p < 100000)
          tenure = 1;
      else if(p < 1000000)
          tenure = 5;
      else if(p < 7000000)
          tenure = 7;
      else if(p < 10000000)
          tenure = 10;
      else 
          tenure = 15;
      
      double R = r / (12 * 100); // one month interest
      double T = tenure * 12; // tenure in months
      EMI = (p * R * pow(1 + R, T)) / (pow(1 + R, T) - 1);  //monthly interest 
    }
    
    //printLoanDetails Function with 2 parameters 
    void printLoanDetails(double loanAmt, double interestRate)
    {
        System.out.println("\n========== LOAN DETAILS ========== ");
        System.out.println("LOAN AMOUNT: " + loanAmt);
        System.out.println("RATE OF INTEREST: " + interestRate);
        System.out.println("MONTHLY PAYMENT: " + EMI);
        System.out.println("PERIOD OF REPAYMENT: " + tenure + " years");
    }
    
    //printLoanDetails Function with 3 parameters 
    void printLoanDetails(double loanAmt, double interestRate, int grams)
    {
        System.out.println("\n========== LOAN DETAILS ========== ");
        System.out.println("WEIGHTOF GOLD PLEDGED: " + grams + " grams");
        System.out.println("LOAN AMOUNT: " + loanAmt);
        System.out.println("RATE OF INTEREST: " + interestRate);
        System.out.println("MONTHLY PAYMENT: " + EMI);
        System.out.println("PERIOD OF REPAYMENT: " + tenure + " years");
    }
}    

class IndianBank extends Bank
{
    //rate of interest for different types of loans in Indian Bank
    double interestRate_Personal = 7.5;
    double interestRate_Housing = 8;
    double interestRate_Gold = 8.25;
    double interestRate_Car = 6;
    double interestRate_Educational = 6.3;

    //This function assigns the rate of interest based on loan type
    void CalculateLoan(int loanType, double loanAmt, int grams)
    {
        switch (loanType) 
        {
            case 1:
                emiCalculation(loanAmt, interestRate_Personal);
                printLoanDetails(loanAmt, interestRate_Personal);
                break;
            case 2:
                emiCalculation(loanAmt, interestRate_Housing);
                printLoanDetails(loanAmt, interestRate_Housing);
                break;
            case 3:
                emiCalculation(loanAmt, interestRate_Gold);
                printLoanDetails(loanAmt, interestRate_Gold, grams);
                break;
            case 4:
                emiCalculation(loanAmt, interestRate_Car);
                printLoanDetails(loanAmt, interestRate_Car);
                break;
            case 5:
                emiCalculation(loanAmt, interestRate_Educational);
                printLoanDetails(loanAmt, interestRate_Educational);
                break;
            default:
                break;
        }
    }
}

class CanaraBank extends Bank
{
    //rate of interest for different types of loans in Canara Bank
    double interestRate_Personal = 8.5;
    double interestRate_Housing = 7;
    double interestRate_Gold = 8.25;
    double interestRate_Car = 7;
    double interestRate_Educational = 8;

    //This function assigns the rate of interest based on loan type
    void CalculateLoan(int loanType, double loanAmt, int grams)
    {
        switch (loanType) 
        {
            case 1:
                emiCalculation(loanAmt, interestRate_Personal);
                printLoanDetails(loanAmt, interestRate_Personal);
                break;
            case 2:
                emiCalculation(loanAmt, interestRate_Housing);
                printLoanDetails(loanAmt, interestRate_Housing);
                break;
            case 3:
                emiCalculation(loanAmt, interestRate_Gold);
                printLoanDetails(loanAmt, interestRate_Gold, grams);
                break;
            case 4:
                emiCalculation(loanAmt, interestRate_Car);
                printLoanDetails(loanAmt, interestRate_Car);
                break;
            case 5:
                emiCalculation(loanAmt, interestRate_Educational);
                printLoanDetails(loanAmt, interestRate_Educational);
                break;
            default:
                break;
        }
    }
}

class HDFCBank extends Bank
{
    //rate of interest for different types of loans in HDFC Bank
    double interestRate_Personal = 8;
    double interestRate_Housing = 7;
    double interestRate_Gold = 9;
    double interestRate_Car = 7.5;
    double interestRate_Educational = 7.5;

    //This function assigns the rate of interest based on loan type
    void CalculateLoan(int loanType, double loanAmt, int grams)
    {
        switch (loanType) 
        {
            case 1:
                emiCalculation(loanAmt, interestRate_Personal);
                printLoanDetails(loanAmt, interestRate_Personal);
                break;
            case 2:
                emiCalculation(loanAmt, interestRate_Housing);
                printLoanDetails(loanAmt, interestRate_Housing);
                break;
            case 3:
                emiCalculation(loanAmt, interestRate_Gold);
                printLoanDetails(loanAmt, interestRate_Gold, grams);
                break;
            case 4:
                emiCalculation(loanAmt, interestRate_Car);
                printLoanDetails(loanAmt, interestRate_Car);
                break;
            case 5:
                emiCalculation(loanAmt, interestRate_Educational);
                printLoanDetails(loanAmt, interestRate_Educational);
                break;
            default:
                break;
        }
    }
}

class KVB_Bank extends Bank
{
    //rate of interest for different types of loans in Karur Vysya Bank
    double interestRate_Personal = 6.5;
    double interestRate_Housing = 7.6;
    double interestRate_Gold = 8;
    double interestRate_Car = 5;
    double interestRate_Educational = 9.5;

    //This function assigns the rate of interest based on loan type
    void CalculateLoan(int loanType, double loanAmt, int grams)
    {
        switch (loanType) 
        {
            case 1:
                emiCalculation(loanAmt, interestRate_Personal);
                printLoanDetails(loanAmt, interestRate_Personal);
                break;
            case 2:
                emiCalculation(loanAmt, interestRate_Housing);
                printLoanDetails(loanAmt, interestRate_Housing);
                break;
            case 3:
                emiCalculation(loanAmt, interestRate_Gold);
                printLoanDetails(loanAmt, interestRate_Gold, grams);
                break;
            case 4:
                emiCalculation(loanAmt, interestRate_Car);
                printLoanDetails(loanAmt, interestRate_Car);
                break;
            case 5:
                emiCalculation(loanAmt, interestRate_Educational);
                printLoanDetails(loanAmt, interestRate_Educational);
                break;
            default:
                break;
        }
    }
}

public class LoanTest {

    public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in);
       int bankNo;   
       int loanType;
       double loanAmt;
       int grams=0;
       System.out.println("=============== EMI CALCULATOR =============== ");
       System.out.println("Choose the bank (1-4)");
       System.out.println("1.Indian Bank   2.Canara Bank   3.HDFC    4.Karur Vysya Bank");
       bankNo = s.nextInt();
       System.out.println("Choose the type of loan (1-5)");
       System.out.println("1.Personal   2.Housing   3.Gold   4.Car   5.Educational");
       loanType = s.nextInt();
       if(loanType != 3)    
       {
           System.out.println("Enter the loan amount required (in Rupees)");
           loanAmt = s.nextDouble();
       }   
       else     //in case of gold loan
       {
           System.out.println("Enter the weight of gold to be pledged (in Grams)");
           grams = s.nextInt();
           //Loan sanctioned for 75% of the amount gold's worth
           //Assumed that 1 gram of gold is worth Rs.3434/-
           loanAmt = grams*3434*0.75;
       }
       
       //Creates object for the corresponding bank's class and calls the necessary function
       switch(bankNo)
       {
           case 1:
               IndianBank obj_indianBank = new IndianBank();
               obj_indianBank.CalculateLoan(loanType, loanAmt, grams);
               break;
           case 2:
               CanaraBank obj_canaraBank = new CanaraBank();
               obj_canaraBank.CalculateLoan(loanType, loanAmt, grams);
               break;
            case 3:
               HDFCBank obj_HDFCBank = new HDFCBank();
               obj_HDFCBank.CalculateLoan(loanType, loanAmt, grams);
               break;
            case 4:
               KVB_Bank obj_KVB_Bank = new KVB_Bank();
               obj_KVB_Bank.CalculateLoan(loanType, loanAmt, grams);
               break;
            default:
                System.out.println("Choose among the given banks (1-4)");
                break;
       }
    }
}
