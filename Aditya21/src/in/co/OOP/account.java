package in.co.OOP;

public class account{
	private int accountNo;
	private String accountType;
	private static int balance;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		if(amount >0) {
			balance+= amount;
			System.out.println("Deposit Sucesful. new balance : "+balance);
		}else {System.out.println("Invalid Deposit Amount.");
		}	
	}
	public static void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful. New balance: " + balance);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient balance.");
		}
	
			
		}
		public static void main(String[] args) {
			account a=new account();
			a.setAccountNo(998273);
			a.setAccountType("saving");
			a.setBalance(25000);
			a.deposit(3000);
			a.withdraw(5000);
			System.out.println(a.getAccountNo());
			System.out.println(a.getAccountType());
			System.out.println(a.getBalance());
			
		 System.out.println();
		}
	}
