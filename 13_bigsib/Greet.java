//Eric

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);
	
	BigSib joe = new BigSib("Salutations");
	
	greeting= joe.greet("Dr. Spaceman");
	System.out.println(greeting);
	
	BigSib mama = new BigSib("Hey ya");
	
	greeting= mama.greet("Kong Fooey");
	System.out.println(greeting);
	
	BigSib sky = new BigSib("sup");
	
	greeting= sky.greet("Mom");
	System.out.println(greeting);

  }
}
