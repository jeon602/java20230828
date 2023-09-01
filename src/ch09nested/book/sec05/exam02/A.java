package ch09nested.book.sec05.exam02;
//407페이지
public class A {
    String field = "A-field";
   void method(){
       System.out.println("A-method");
   }
   class B{
       String field = "B-field";
   }
   void print(){//
       System.out.println(this.field);
       this.method();
       System.out.println(A.this.field);
       A.this.method();
   }
}
