
public class stringmethod {

	public static void main(String[] args) {
		String s="hello world";
		System.out.println(s);
		System.out.println("length="+s.length());
		
		System.out.println("index of w="+s.indexOf('w'));
		
		//print the char at position 3
		System.out.println("character at 3="+s.charAt(3));
	    //System.out.println("character at 12="+s.charAt(12));
		System.out.println("Command after exception");
		
		System.out.println("INDEX OF 1="+s.indexOf('1'));
		System.out.println("INDEX OF SECOND 1="+s.indexOf('1',3));
		System.out.println("INDEX OF THIRD 1="+s.indexOf('1',4));
		
		System.out.println("substring:"+s.substring(3));
		System.out.println("only lowo"+s.substring(3,8));
	}

}
