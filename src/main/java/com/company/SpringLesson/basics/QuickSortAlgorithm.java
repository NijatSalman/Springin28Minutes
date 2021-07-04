package com.company.SpringLesson.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("QuickSortAlgorithm")
public class QuickSortAlgorithm implements SortAlgorithm{


    @Override
    public int[] sort(int findNumber) {
        System.out.println("QuickSortAlgorithm");
        return new int[]{3,2,1};
    }
}
