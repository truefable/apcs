//Eric He
//APCS
//HW13 -- Where do BigSibs Come From?
//2021-10-07

/* DISCO: the constructor has the name of the class
QCC:
*/
  
public class BigSib {
	String helloMsg;
	public BigSib() {
		helloMsg = "Hello";
	}
	public String setHelloMsg(String s) {
		helloMsg = s;
		return helloMsg;
	}
	public String greet(String s) {
		String message = (helloMsg + " " + s);
		return message;
	}
}
