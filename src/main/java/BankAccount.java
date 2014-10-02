//package ca.uwo.csd.cs2212.USERNAME;
 
public class BankAccount {
 
  private double balance;
 
  public BankAccount(double balance) {
   this.balance = balance;
  }
 
  public double debit(double amount) {
   if (balance < amount) {
    //amount = balance;
    amount = balanceXXX;
   }
 
   balance -= amount;
   return amount;
  }
 
}
