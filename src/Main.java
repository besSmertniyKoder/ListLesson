
//1) Замерьте время, за которое в ArrayList
// добавятся 10000 элементов.
//
//2) Замерьте время, за которое в LinkedList
// добавятся 10000 элементов. Сравните с предыдущим.
//


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        long duration;
        List<Integer> arrayList = new ArrayList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000;
        System.out.println("Время добавения arrayList: " + duration);

        LinkedList<Integer> linkedList = new LinkedList<>();
        long startTimeL = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            linkedList.add(i);
        }
        long endTimeL = System.nanoTime();
        long durationL = (startTimeL - endTimeL) / 1000000;
        System.out.println("Время добавения linkedList: " + durationL);



    }
}
