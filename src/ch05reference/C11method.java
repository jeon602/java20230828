package ch05reference;

public class C11method {

	public static void main(String[] args) {
		int[] a = method();
		System.out.println("메인 내부");
		System.out.println(System.identityHashCode(a));
	}

	public static int[] method() {
		int[] c = {9,7,5};
		
		System.out.println("메소드1 내부");
		System.out.println(System.identityHashCode(c));
		
		return c;
	}
}
