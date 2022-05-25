package hello.servlet.simpleTest;

import org.junit.jupiter.api.Test;

import java.util.*;

public class IteratorTest {

    @Test
    void test1() {
        // 컬렉션 생성
        ArrayList<String> cars = new ArrayList<>();
        cars.add("벤츠");
        cars.add("람보르기니");
        cars.add("롤스로이스");
        cars.add("페라리");

        // iterator 획득
        Iterator<String> iterator = cars.iterator();

        // while문을 사용한 경우
        while(iterator.hasNext())
        {
            String str = iterator.next();
            System.out.println(str);
        }

        // for-each문을 사용한 경우
        for (String str : cars)
        {
            System.out.println(str);
        }
    }

    @Test
    void test2(){
        Set<String> cars = new HashSet<>();
        cars.add("벤츠");
        cars.add("람보르기니");
        cars.add("롤스로이스");
        cars.add("페라리");

        // while문을 사용한 경우
        Iterator<String> iterator = cars.iterator();

        while(iterator.hasNext())
        {
            System.out.println("cars : " + iterator.next());
        }

        // for-each문을 사용한 경우
        for (String car : cars)
        {
            System.out.println("cars : " + car);
        }
    }

    @Test
    void test3(){
        // 컬렉션 생성
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        System.out.println("while문 지나기 전 리스트에 들어있던 값 : " + list);

        // 리스트에 들어있는 값에 각각 '+' 붙이기
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext())
        {
            Object element = listIterator.next();
            listIterator.set(element + "+");
        }
        System.out.println("while문 지난 후 수정된 결과 : " + list);

        // 리스트에 들어있는 값을 역순으로 표시
        System.out.print("역순 출력 결과 : ");
        while(listIterator.hasPrevious())
        {
            Object element = listIterator.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
