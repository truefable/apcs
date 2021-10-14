
public class BankAccount{
	private double balance;
	private String accountNumber;
	private String username;
	private String password;
	private String PIN;

	public void main(String args[]){
		balance = 100;
		accountNumber = "123456789";
		username = "A";
		password = "a";
		PIN = "1234";
		showAccountInfo(A,a);
	}

	public String setUsername(String newUsername){
		username = newUsername;
		return username;
	}

        public String setPassword(String newPassword){
               	password = newPassword;
                return password;
        }

        public String setPIN(String PIN){
                PIN = newPIN;
                return PIN;
        }

	public double withdraw(double money,String password){
		balance = balance - money;
		return balance;
	}

        public double deposit(double money,String password){
                balance = balance + money;
                return balance;
        }

	public void showAccountInfo(String username,String password){
		if ((this.username = username) && (this.password = password)){
			System.out.println("account number: " + accountNumber);
                        System.out.println("PIN: " + PIN);
                        System.out.println("username: " + username);
                        System.out.println("password: " + password);
                        System.out.println("balance: " + balance);
		}
	}
}
