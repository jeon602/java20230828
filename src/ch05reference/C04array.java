package ch05reference;

public class C04array {

	public static void main(String[] args) {
	 int a = 5;
	 int b = a;
	 
	 System.out.println(a);
	 System.out.println(b);
	 
	 int[] c = { 3, 4, 5}; //문자열 345가 저장되어 있는 인스턴스가 따로 있고, 인스턴스의 주소를 가진 메모리가 c라는 것.
	 int[] d = c; //c가 가진 값을 d도 그대로 저장됨. 인스턴스가 복제되는 것은 아니다.
	 //시청은 하나 주소는 둘.
	 
	 System.out.println(c[1]);
	 System.out.println(d[1]);
	 
	 c[2]=55;
	 System.out.println(c[2]);//55
	 System.out.println(d[2]);//5가 아닌, 55로 나온다.
	 
	
	}

}
