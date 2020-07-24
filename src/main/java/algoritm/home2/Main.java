package algoritm.home2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = 100000;
        Random random = new Random();
        final MyArrayList mySortedArrayList_1 = new MyArrayList(N);
        final MyArrayList mySortedArrayList_2 = new MyArrayList(N);
        final MyArrayList mySortedArrayList_3 = new MyArrayList(N);


        for (int x = 0; x < N; x++) {
            int v = random.nextInt();
            mySortedArrayList_1.add(v);
            mySortedArrayList_2.add(v);
            mySortedArrayList_3.add(v);
        }

        long startTime1 = System.currentTimeMillis();
        mySortedArrayList_1.bubbleSort();
        System.out.println("bubbleSort=" + (System.currentTimeMillis() - startTime1));

        long startTime2 = System.currentTimeMillis();
        mySortedArrayList_2.selectionSort();
        System.out.println("selectionSort=" + (System.currentTimeMillis() - startTime2));

        long startTime3 = System.currentTimeMillis();
        mySortedArrayList_3.insertionSort();
        System.out.println("insertionSort=" + (System.currentTimeMillis() - startTime3));
    }

}
