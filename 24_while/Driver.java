public class Driver{
	public static void main(String args[]){
		Coin Nob = new Coin();
		Coin Nrob = new Coin();
		Nob.flip();
		Nrob.flip();
		flipHead(Nob, 20);
		flipTail(Nrob, 40);
		match(Nob, Nrob, 2005);
	}
	
	
	public static void flipHead(Coin c,int x){
		while (c.headsCtr < x) {
			c.flip();
		}
	}
	
	public static void flipTail(Coin c,int y){
		while (c.tailsCtr < y) {
			c.flip();
		}
	}
	
	public static void match(Coin a,Coin b){
		int matchCtr = 0;
		if (a.UpFace == b.UpFace) {
			matchCtr = 1;
		}
		while (matchCtr < 2005){
			a.flip();
			b.flip();
			if (a.UpFace == b.UpFace) {
				matchCtr += 1;
			}
		}
	}
}
			
