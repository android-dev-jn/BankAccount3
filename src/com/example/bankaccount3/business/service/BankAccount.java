package com.example.bankaccount3.business.service;

import java.util.ArrayList;
import java.util.Calendar;

import com.example.bankaccount3.data.dao.BankAccountDAO;
import com.example.bankaccount3.data.dao.TransactionDAO;
import com.example.bankaccount3.data.entity.BankAccountDTO;
import com.example.bankaccount3.data.entity.TransactionDTO;

public class BankAccount {

	public static BankAccountDAO bankAccountDAO;
	public static TransactionDAO transactionDAO;
	public static Calendar calendar;

	public static BankAccountDTO openAccount(String string) {
		BankAccountDTO bankAccountDTO = new BankAccountDTO();
		bankAccountDTO.setAccountNumber(string);
		bankAccountDTO.setTimestamp(calendar.getTimeInMillis());
		bankAccountDAO.save(bankAccountDTO);
		return null;
	}

	public static BankAccountDTO getAccount(String accountNumber) {
		bankAccountDAO.getAccount(accountNumber);
		return null;
	}

	public static void deposit(String accountNumber, double amount,
			String description) {
		BankAccountDTO bankAccountDTO = bankAccountDAO
				.getAccount(accountNumber);
		bankAccountDTO.setBalance(bankAccountDTO.getBalance() + amount);
		bankAccountDAO.save(bankAccountDTO);

		long timestamp = calendar.getTimeInMillis();
		TransactionDTO transactionDTO = new TransactionDTO(accountNumber,
				timestamp, amount, description);
		transactionDAO.createTransaction(transactionDTO);
	}

	public static void withdraw(String accountNumber, double amount,
			String description) {
		BankAccountDTO bankAccountDTO = bankAccountDAO
				.getAccount(accountNumber);
		bankAccountDTO.setBalance(bankAccountDTO.getBalance() - amount);
		bankAccountDAO.save(bankAccountDTO);

	}

	public static ArrayList<TransactionDTO> getTransactionOccurred(
			String accountNumber) {
		ArrayList<TransactionDTO> listTransactions = transactionDAO
				.getTransactionOccurred(accountNumber);
		return listTransactions;
	}

	public static void getTransactionsInPeriodOfTime(String accountNumber,
			long startTime, long stopTime) {
		transactionDAO.getTransactionsInPeriodOfTime(accountNumber, startTime,
				stopTime);

	}

	public static void getTheLastNTransactions(String accountNumber, int n) {
		transactionDAO.getTheLastNTransactions(accountNumber, n);
	}

}
