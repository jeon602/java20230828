package ch05enumeration.book.sec12;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1:
                today =Week.SUNDAY; break;
            case 2:
                today =Week.MONDAY; break;
            case 3:
                today =Week.TUSEDAY;break;
            case 4:
                today=Week.WEDNESDAY;break;
            case 5:
                today=Week.THURSDAY;break;
            case 6:
                today=Week.FRIDAY;break;
            case 7:
                today=Week.SATURDAY;break;
        }
//        switch (week){
//            case 1 : today = Week.SUNDAY; break;
//            case 2 : today = Week.MONDAY; break;
//            case 3 : today = Week.SUNDAY; break;
//            case 4 : today = Week.SUNDAY; break;
//            case 5 : today = Week.SUNDAY; break;
//            case 6 : today = Week.SUNDAY; break;
//            case 7 : today = Week.SUNDAY; break;
//        }
        if (today == Week.SUNDAY){
            System.out.println("일요일에는 축구를 합니다.");
        }else{
            System.out.println("열심히 자바를 공부합니다.");
        }
    }
}
//Calendar. getInsatance api에

//오늘은 일요일이 아니라 수요일이라 열심히 자바를 공부합니다가 출력된다. 195~197의 예제
