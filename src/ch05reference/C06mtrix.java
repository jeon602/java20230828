package ch05reference;

public class C06mtrix {

	public static void main(String[] args) {
		int[][]a = {{1,2,3},{10,20,30},{100,200,300}};
		//a의 타입은 참조타입,{1,2,3}=이게 int[]
		int[][]b =a; //인티저 배열, 배열에 b라는 저장공간에 a와 같은 주소값이 저장된다

		System.out.println(a[0][2]); //3
		System.out.println(b[0][2]);//3

		a[1][1] =2000;
		System.out.println(a[1][1]); //2000
		System.out.println(b[1][1]);//2000
		
	 b[2][2] =9999;
	 System.out.println(b[2][2]);
	 System.out.println(a[2][2]); 
	
	 b[2] = new int[] {111,222,333};
	 System.out.println(b[2][2]);
	 System.out.println(a[2][2]);
	 
	 b= new int [][] {{33, 44},{22,11}}; //b에 새객체(instance)의 참조값 할당됨.
	System.out.println(b[0][0]); //33
	System.out.println(a[0][0]);//1
	}

}
