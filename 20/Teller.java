public class Teller{
	public void main(String args[]){
		//Test
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
		
		//Break
		BankAccount p1 = new BankAccount();
		p1.setName("p1");
		p1.setPin(999);
		System.out.println(p1.toString());
		
		BankAccount p2 = new BankAccount();
		p2.setAccountNumber(1111111111);
		System.out.println(p2.toString());
		
		BankAccount p3 = new BankAccount();
		p3.setBalance(-100);
		System.out.println(p3.toString());
		
		BankAccount p4 = new BankAccount();
		p4.setBalance(100);
		p4.withdraw(-100);
		System.out.println(p4.toString());
    }		
}
