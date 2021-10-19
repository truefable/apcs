public class Teller{
	public void main(String args[]){
		BankAccount ba = new BankAccount();
    		ba.setName("A");
    		ba.setPassword("pass123");
    		ba.setPin(1111);
    		ba.setAccountNumber(123456789);
    		ba.setBalance(10000.11);
    		System.out.println(ba.toString());
    		ba.deposit(900.10);
    		System.out.println(ba.toString());
    		ba.withdraw(2000.90);
    		System.out.println(ba.toString());
    }		
}
