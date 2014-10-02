//package ca.uwo.csd.cs2212.USERNAME;
 
public class BankAccount {
 
  private double balance;
 
  public BankAccount(double balance) {
   this.balance = balance;
  }
 
  public double kredit(double amount) {
   balance += amount;
   return amount;
  }
 
   public double debit(double amount) {

   // test code 1
   if (balance > amount) {
    //amount = balance;
   }

   if (balance < amount) {
    amount = balance;
    //amount = balanceXXX; // created error
   }

   balance -= amount;
   return amount;
  }
 
}
