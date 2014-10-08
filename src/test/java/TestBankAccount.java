//package ca.uwo.csd.cs2212.USERNAME;
 
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
 
public class TestBankAccount {
	
	@Test
	public void testDebitWithSufficientFunds() {
		BankAccount account = new BankAccount(10);
		double amount = account.debit(5);
		Assert.assertEquals(5.0, amount);
	}
	
	@Test
	public void testDebitWithInsSufficientFunds() {
		BankAccount account = new BankAccount(10);
		double amount = account.debit(11);
		Assert.assertEquals(10.0, amount);
	}
	
	@Test
	public void testDebitWithNoFunds() {
		BankAccount account = new BankAccount(0);
		double amount = account.debit(11);
		Assert.assertEquals(0.0, amount);
	}
	
	@Test
	public void testKreditWithFunds() {
		BankAccount account = new BankAccount(0);
		double amount = account.kredit(10);
		Assert.assertEquals(10.0, amount);
	}

	@Test
	public void testKreditWithFunds2() {
	BankAccount account = new BankAccount(0);
	double amount = account.kredit(10.50);
	Assert.assertEquals(10.50, amount);
	}

	@Test
	public void testKreditWithNoFunds() {
		BankAccount account = new BankAccount(10);
		double amount = account.kredit(0);
		Assert.assertEquals(10.0, amount);
	}

	@Test
	public void testKreditWithNegativeFunds() {
		BankAccount account = new BankAccount(10);
		double amount = account.kredit(-5);
		Assert.assertEquals(10.0, amount);
	}	
	
	@Test
	public void testKreditWithNegativeFunds2() {
		BankAccount account = new BankAccount(10);
		double amount = account.kredit(-5.50);
		Assert.assertEquals(10.0, amount);
	}

}
