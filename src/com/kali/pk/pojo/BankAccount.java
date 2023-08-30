package com.kali.pk.pojo;

import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;		

public class BankAccount {
	private static String bankName;
	private static String branchName;
	private static String ifsc;
	
	
	private long accNum;
	private String accHName;
	private double balance;
	
	static {
		out.println("\nBank Account class is loaded");
		try {Thread.sleep(2000);}
		catch(InterruptedException e) {}
		
		out.println("SV memory allocated with default values ");
		try {Thread.sleep(1000);}
		catch(InterruptedException e) {}
		
		out.println("Reading static variable values from file and initializing them");
		try {Thread.sleep(1000);}
		catch(InterruptedException e) {}
		
		try {
			/* Connecting to file */
			BufferedReader fileReader = new BufferedReader(new FileReader("bannkdetails.txt"));
			
			/*Reading values file and storing in static variable */
			bankName    = fileReader.readLine();
			branchName  = fileReader.readLine();
			ifsc        = fileReader.readLine();
			
			out.println("SV are initialized with file values\n");
			try {Thread.sleep(1000);}
			catch(InterruptedException e) {}
			
		}catch(FileNotFoundException e) {
			out.println("Error: BankDetails.txt file not found ");
		}catch(IOException e) {
			e.printStackTrace();
		}
		try {Thread.sleep(1000);}
		catch(InterruptedException e) {}
	}
		public BankAccount(long accNum, String accHName ,double balance) {
			out.println("NSVs memory allocated with default values");
			try {Thread.sleep(1000);}
			catch(InterruptedException e) {}
			
			out.println("NSVs are being initialized with given vales");
			try {Thread.sleep(1000);}
			catch(InterruptedException e) {}
			
			this.accHName = accHName;
			this.accNum   = accNum;
			this.balance  = balance;
			
			out.println("NSVs initialized with given object values\n");
			try {Thread.sleep(1000);}
			catch(InterruptedException e) {}
			

		}
		public static String getBankName() {
			return bankName;
		}
		public static void setBankName(String bankName) {
			BankAccount.bankName = bankName;
		}
		public static String getBranchName() {
			return branchName;
		}
		public static void setBranchName(String branchName) {
			BankAccount.branchName = branchName;
		}
		public static String getIfsc() {
			return ifsc;
		}
		public static void setIfsc(String ifsc) {
			BankAccount.ifsc = ifsc;
		}
		
		public void deposit(double amt) {
			this.balance = this.balance+amt;
		}
		
		public void withdraw(double amt) {
			this.balance = this.balance-amt;
			}
		public void balance() {
			out.println(balance);
		}
		@Override
		public String toString() {
			return ("\n bankName \t:" + bankName)+"\n"+
					("branchName\t:  "+branchName)+"\n"+
					("ifsc\t\t:      "+ifsc)+"\n"+
					("accNum\t\t: "+accNum)+"\n"+
					("accHName\t\t: "+accHName)+"\n"+
					("balance\t\t "+balance);
		}
		
		
		
		
		
		
		
		
		
		
		
}
