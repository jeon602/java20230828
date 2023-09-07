package afterlecture.book.sec573;

public class Product<K,M> {
    private K kind;
    private M model;

    public K getKind(){return this.kind; } // 타입 파라미터, 리턴 타입 -- 매개변수 타입으로 사용
    public M getModel(){return this.model;}
    public void setKind(K kind){this.kind= kind;}
    public void setModel(M model){this.model= model;}
}
