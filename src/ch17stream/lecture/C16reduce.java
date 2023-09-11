package ch17stream.lecture;

import java.util.List;
import java.util.Optional;

//20230913 수요일 강의 내용: Optional
public class C16reduce {
    public static void main(String[] args) {
        var list = List.of(3,4,1);
        Integer max = list.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("max = "+ max);
//list스트림의 요소를 최대값으로 결합한다. reduce 메소드는 두개의 인자를 받는데, 첫번째 인자인 Integer.MIN_VALUE의 경우 초기값으로 사용된다.
//        Max::max는 이항 연산자로 스트림의 각 요소와 초기값 or 이전 결과를 비교하여 최대값을 계산한다(두 수를 비교하여 최대 최소 값을 얻는다)
//
        List<Integer> list2 = List.of();
        Integer max2 = list2.stream()
                .reduce(Integer.MIN_VALUE,Math::max);
        System.out.println("max2 = "+ max2);
//        위와 같은 내용 설명을 위한 복사
//         List<Integer> list2 = List.of();
//        Integer max2 = list2.stream()
//                .reduce(Integer.MIN_VALUE,Math::max);
//                    ->list 2에 대해서도 최대값 출력.;
//                     Integer.MIM_VALUE를 사용하고 Math::max를 사용해서 최대값을 계산합니다. max2 변수에는 초기값이 그대로 남아있어 결과가 -2147483648이 되는 것/
//        System.out.println("max2 = "+ max2);
//
        Optional<Integer> max3 = list2.stream()
                .reduce(Math::max);
        System.out.println("reduce = "+ max3);
//  reduce메소드에 초기값을 제공하지 않고 최대값을 구한다. 결과는 Optional<Integer> 형태로 반환된다
//  왜???? 리스트 2에서 최대값을 구할 수 없기 때문,,, 결과가 없음을 나타내기 위해 optional을 사용한다.

//  reduce method는 stream 요소를 조합하여 결과를 얻기 위해 사용함.
//  초기값을 제공하면 stream 이나 초기값을 가진 stream에서도 작동.
//        결과는 초기값이 없으면 Optional로 감싸서 반환된다.


    }
}
/*2023.09.12 화요일 오후 5시 13분
package ch17stream.lecture;

import java.util.List;
import java.util.Optional;

public class C16reduce {
    public static void main(String[] args) {
        var list = List.of(3, 4, 1);
        Integer max = list.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("max = " + max);

        List<Integer> list2 = List.of();
        Integer max2 = list2.stream()
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("max2 = " + max2);

        Optional<Integer> max3 = list2.stream()
                .reduce(Math::max);
        System.out.println("reduce = " + max3);
    }
}
//max = 4
//max2 = -2147483648
//reduce = Optional.empty

*/