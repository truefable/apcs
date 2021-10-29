public class Rof{
	public static void main(String args[]){
		System.out.println(fenceF(0));
		System.out.println(fenceF(1));
		System.out.println(fenceF(2));
		System.out.println(fenceF(4));
		System.out.println(fenceF(8));
		System.out.println(reverseF("desserts"));
		System.out.println(reverseF("stressed"));
		System.out.println(reverseR("desserts"));
		System.out.println(reverseR("stressed"));
	}
	
	public static String fenceF(int n){
		String f = "l";
		for (int i = 1; i < n; i++){
			f = f + "--l";
		}
		return f;
	}
	
	public static String reverseF(String s){
		String r = "";
		for (int i = s.length(); i > 0; i--){
			r = r + s.substring(i - 1, i - 1);
		}
		return r;
	}
	
	public static String reverseR(String s){
		if (s.length() < 2){
			return s;
		} else {
			return reverseR(s.substring(1)) + s.substring(0,0);
		}
	}
}