package com.kali.pk.blogic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

import com.kali.pk.pojo.BankAccount;

public class Bank {
	private BankAccount[] accounts;
	private int size;
	private Scanner scanner;
	private AtomicLong accNumGenerator;
	
	public Bank() {
		accounts  = new BankAccount[10];
		size      =0;
		scanner  = new Scanner(System.in);
		try {
			BufferedReader accNumReader = new BufferedReader(new FileReader("accNumSeq.txt"));
			long accNumSeq = Long.parseLong(accNumReader.readLine());
			accNumGenerator = new AtomicLong(accNumSeq);
					
		}catch(FileNotFoundException e) {
			System.out.println("accNumReader.txt is not found");
		}catch(IOException e) {}
	}

}
