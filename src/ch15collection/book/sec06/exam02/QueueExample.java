package ch15collection.book.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendmail", "이주율"));
        messageQueue.offer(new Message("sendmail", "이홍윤"));
        messageQueue.offer(new Message("sendmail", "이효민"));

        while(!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
            switch (message.command){
                case "sengMail":
                    System.out.println( message.to +"님에게 메일을 보냅니다.");
                    break;

                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다.");
                    break;

                case "sendKakaoTalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
