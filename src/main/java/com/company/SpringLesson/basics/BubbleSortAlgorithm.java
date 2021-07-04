package com.company.SpringLesson.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("BubbleSort")
public class BubbleSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int findNumber) {
        System.out.println("BubbleSortAlgorithm");
        int[] array=new int[]{1,2,3,4};
        return array;
    }
}
