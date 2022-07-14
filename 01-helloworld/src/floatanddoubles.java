
public class floatanddoubles {

	public static void main(String[] args) {
		System.out.println("min float value:" + Float.MIN_VALUE);
		System.out.println("max integer:"+ Float.MAX_VALUE);
		
		System.out.println("min double value:" + Double.MIN_VALUE);
		System.out.println("max integer:"+ Double.MAX_VALUE);

		int val=5;
		float val2=5.25f;
		double val3=5.26;
		
		val=6;
		val2=6f;
		val3=6d;
		System.out.println(val);
		System.out.println(val2);
		System.out.println(val3);
		
		int intval=7/2;
		System.out.println(intval);
		float floatval=7f/2f;
		System.out.println(floatval);
		
		double d=12.5;
		float f=12.5f;
		
		double dval=7.0/2.0;
		System.out.println(dval);
		
		System.out.println("intval:" + intval+",floatval:" + floatval);		
	}

}
