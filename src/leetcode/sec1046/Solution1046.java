package leetcode.sec1046;

//import java.awt.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution1046 {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>(); // 다시 시도

        for (int Stone : stones) {
            list.add(Stone);
        }

        //sort 오름차순으로 정렬하고 싶은 배열을 전달인자로 주면 전달인자로 받은 배열이 정렬
        //문자열의 경우 아스키코드 순으로 오름차순 정렬된다.
        //java api 17-> Sort (Array)-java.util Arrays- static method

        //list ,sort, remove, add, size *모르면 다시 찾아볼 것..!!!!!
        /*//sort, remove, add, size : 다음은 찾아본 예시를 메모한 것(문제와는 관련 X)
        int[] intArr = {2,7,4,1,8,1};
        for (int i: intArr)
            System.out.println(i + "");
        System.out.println();
        */
        /*remove : ArrayList에서 특정값을 삭제하는 방법, --1)ArrayList()2)ArrayListAll() 3)Interator.remove()(?아직 모르겠음)
         remove (int index) remove()메소드의 파라미터로 Object객체 전달-> ArratList에서 해당하는 객체를 찾아 첫번째 값만 삭제
         -----------------------------------------------------------------------------*/
        //[2,7,4,,1,8,1]
        //1.sort [8,7,4,2,1,1]
        //2.remove [4,2,1,1,1]
        //3.add[1,1,1,2]
        //1.sort[2,1,1,1]
        //2/remove [1]
        //3.add [1]

        //size가 1보다 클때까지


        //while (list.size() > 1) {
        // list.sort(new Comparator<Integer>() {
        //       @Override
        //         public int compare(Integer o1, Integer o2) {
        //               return o1 - o2;
        //람다로 고치면,,
        while (list.size() > 1) {
            //1.sort
            list.sort((o1, o2) -> o2 - o1);

//                list.sort((o1, o2) -> o1 - o2 ); =>는 1.sort [8,7,4,2,1,1]로 정렬되는 것이 아닌, 1,1,2,4,8정렬되어 나온다.
//                왜? :

            //2.remove
            int stone1 = list.remove(0);
            int stone2 = list.remove(0);
            //3.add + add는 조건문이 들어간다.
            int diff = stone1 - stone2;
            if (diff > 0) {
                list.add(diff);
            }
        }
            if(list.size() == 1) {
                return list.get(0);
            }
            return 0;

    }
}


        //sort 메소드는 parameter: compare이라는 추상메소드를 가진다.function
        //정렬을 한다=>  사람과 달리 컴퓨터는 두 수에서 비교하여 자리를 바꿀지 말지를 결정하는데.
        //874211 중에서 어떤 수가 크다고 할 것이며, 작다고 할 것인지.. 양수 음수 0으로 구분된다.
        //sort - youtube(sort algoristhm) 두수중 비교하여 정렬하는 것이 sort. compare(0,0)로 비교한다.
        //compare(8,4) compare 메소드 : 음수가 나와야 큰수가 오른쪽에 나온다
        //or COMPARE(0,0)두수가 같으면 = 0으로

        // + remove (int index) removw

