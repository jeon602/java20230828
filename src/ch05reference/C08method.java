package ch05reference;

public class C08method {
 public static void main(String[] args) {
	int a = 5; 
	
	method1(a); //5
	
	int b = 50;
	
	method1(b); //50
}
 //a에 있는 값이 p에 복사.
 public static void method1(int p) {
	 System.out.println(p);
 }
}
