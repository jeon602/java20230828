package ch05reference;

public class C03reference {

	public static void main(String[] args) {
		int a = 5;
		int b = a; //a에 5저장, b라는 저장공간에도 a와 같이 저장
	
		String c= "java"; //인스턴스"java"의  주소가 c저장공간에 생김
		String d;//d라는 저장공간 형성 
		d = c; // c 가가르키고 있는 객체와 d가 가르키고 있는 객체가 동일하다
		//인스턴스는 동일할 뿐, 인스턴스도 복사되는 것이 아님
		
		System.out.println(a == b);
	}

}
