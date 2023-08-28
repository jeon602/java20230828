package ch05reference;

public class C10method {

	public static void main(String[] args) {
		int[] a = {3,4,5};
		System.out.println("main 메소드");
		System.out.println(System.identityHashCode(a));
//		method1;
		System.out.println("메소드 호출 후");
		System.out.println(a[0]); //33
		

	}

	public static void method(int[]p) {
		System.out.println("main 메소드");
		System.out.println(System.identityHashCode(p));
		System.out.println(p[0]);
		
		p[0]= 33;
	
	}
}
