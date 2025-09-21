package typecasting;

public class Typecasting01 {

	public static void main(String[] args) {
		//implicite casting
		byte b =10;
		int a =b; //widening is done implicitly here
		System.out.println(a);
		
		int a1= (int)b; //widening is done explicitly by mentioning 
		System.out.println(a1);
		

	}

}
