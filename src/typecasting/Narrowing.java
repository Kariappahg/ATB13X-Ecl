package typecasting;

public class Narrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 300;
		//byte b= val; //nrrowing typecating is not possible implicitilty
		byte b =(byte)val; //doing explicit, but narrowing will cause data losss
		System.out.println(b);
	}

}
