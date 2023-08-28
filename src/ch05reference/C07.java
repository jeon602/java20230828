package ch05reference;

public class C07 {

	public static void main(String[] args) {
	String a = "java";
	String b = "spring";
	String c = a;
	
	int code1= System.identityHashCode(a); //인스턴스 주소값을 알기 위함 - System.identityHashCode();
	int code2= System.identityHashCode(b);
	int code3= System.identityHashCode(c);
	
	System.out.println(code1);
	System.out.println(code2);
	System.out.println(code3);

	}

}
