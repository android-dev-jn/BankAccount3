package com.example.bankaccount3.data.entity;

public class BankAccountDTO {

	private String accountNumber;
	private double balance;
	private Long timestamp;

	public BankAccountDTO(String accountNumber2, double balance) {
		this.accountNumber = accountNumber2;
		this.balance = balance;
	}

	public BankAccountDTO() {
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

}
