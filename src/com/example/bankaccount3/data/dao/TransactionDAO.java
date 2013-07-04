package com.example.bankaccount3.data.dao;

import java.util.ArrayList;

import com.example.bankaccount3.data.entity.TransactionDTO;

public class TransactionDAO {

	public void createTransaction(TransactionDTO transactionDTO) {
	}

	public ArrayList<TransactionDTO> getTransactionOccurred(String accountNumber) {
		return new ArrayList<TransactionDTO>();
	}

	public void getTransactionsInPeriodOfTime(String accountNumber,
			long startTime, long stopTime) {
	}

	public void getTheLastNTransactions(String accountNumber, int n) {
	}

}
