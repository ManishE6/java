
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
		
		String[] s2=s.split("");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		
		String[] s3=s.split("o");
		System.out.println("no of derived words:"+s3.length);
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		System.out.println(s3[1]);
		
		System.out.println("index of space:"+s.indexOf(" "));
		
		System.out.println("replaced:"+s.replace("l","j" ));
		
		System.out.println("Uppercase:"+s.toUpperCase());
		System.out.println("Lowercase:"+s.toLowerCase());
	}

}
