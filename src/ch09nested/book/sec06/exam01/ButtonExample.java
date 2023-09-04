package ch09nested.book.sec06.exam01;

import javax.swing.*;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener {
            public void onClick() {
                System.out.println("버튼을 클릭했습니다.");
            }

            @Override
            public void onclick() {

            }
        }
        btnOk.setClickListener(new OkListener());
        btnOk.click();
        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener {
            public void onClick() {
                System.out.println("취소 버튼을 클릭했습니다");
            }

            @Override
            public void onclick() {

            }
        }
    }
}
