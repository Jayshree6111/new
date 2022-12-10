package methodWriting;

public class WrapperClass {
public static void main() {
	int a = 10;
	Integer i = new Integer(a); //autoboxing
	System.out.println(i);
	
	int b= i.intValue();//unboxing
	System.out.println(b);
}
}
