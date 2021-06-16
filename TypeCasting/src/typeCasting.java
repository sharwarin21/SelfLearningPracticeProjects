
public class typeCasting {

	public static void implicitCasting(byte b) {
		// Widening Casting
		// byte->short->char->int->long->float->double
		System.out.println("Byte:" + b);
		short s = b;
		System.out.println("Short:" + s);
		char c = (char) b;
		System.out.println("Char:" + c);
		int i = b;
		System.out.println("Int:" + i);
		long l = b;
		System.out.println("Long:" + l);
		float f = b;
		System.out.println("Float:" + f);
		double d = b;
		System.out.println("Double:" + d);
	}

	public static void explicitCasting(double d) {
		// Narrowing Casting
		// double->float->long->int->char->short->byte
		System.out.println("Double:" + d);
		float f = (float) d;
		System.out.println("Float:" + f);
		long l = (long) d;
		System.out.println("Long:" + l);
		int i = (int) d;
		System.out.println("Int:" + i);
		char c = (char) d;
		System.out.println("Char:" + c);
		short s = (short) d;
		System.out.println("Short:" + s);
		byte b = (byte) d;
		System.out.println("Byte:" + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implicit Casting:");
		byte b = 100;
		implicitCasting(b);
		System.out.println("______________________________");
		System.out.println("Explicit Casting:");
		double d = 125.7;
		explicitCasting(d);
	}

}
