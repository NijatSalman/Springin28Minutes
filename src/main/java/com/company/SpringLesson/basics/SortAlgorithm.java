package com.company.SpringLesson.basics;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface SortAlgorithm {
    int[] sort( int findNumber);
}
