package ch05reference;

public class C05array {

	public static void main(String[] args) {
	int[]a = {3,4,5};
	int[]b = a;
	
	System.out.println(b[2]);
	a[2] =7;
	System.out.println(b[2]);
	
	
	int[] c = {10,20,30}; //참조타입의 변수 c가 가르키고 있는 인스턴스는 102030,이 인스턴스의 주소값을 c가 c에 저장.  
	int[] d = {10,20,30}; 
	c[2] =90;
	System.out.println(c[2]);//90
	System.out.println(d[2]); //90? =====30으로 나옴. 왜? c의 2번째 값만 90으로 덮였기 때문.
	
	}

}
