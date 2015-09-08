package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ATMTest {
	
	ATM atm;

	@Before
	public void setUp() throws Exception {
		atm = new ATM(50.0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDeposit() {
		atm.deposit(20.0);
		assertEquals(atm.getBalance(), 70.0, 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testExceptionDeposit(){
		atm.deposit(-40.0);
	}
	

	@Test
	public void testGetBalance() {
		assertEquals(atm.getBalance(), 50.0,0);
	}

	@Test
	public void testToString() {
		assertEquals(atm.toString(), "Amount balance is $50.00");
	}

	@Test
	public void testWithdraw() {
		double amount = atm.withdraw(20.0);
		assertEquals(atm.getBalance(), 30.0,0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testExceptionWithdraw(){
		double amount = atm.withdraw(70.0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testException2Withdraw(){
		double amount = atm.withdraw(-40.0);
	}

}
