package ch09Intreface.lecture;

public class C07return {
    public static void main(String[] args) {
        CharSequence charSequence = getCharSequence();
        System.out.println(charSequence);
    }

    public static CharSequence getCharSequence(){
        double d= Math.random();

        if(d <0.33 ){
            return  new String("java");
        } else if (d <0.66 ){
            return new StringBuffer("spring");
        }else {
            return new StringBuffer("react");
        }
  }
    //CharSequence///
}


