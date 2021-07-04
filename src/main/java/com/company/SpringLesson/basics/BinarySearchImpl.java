package com.company.SpringLesson.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BinarySearchImpl{

    @Autowired
    @Qualifier("BubbleSort")
     SortAlgorithm sortAlgorithm;

//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        super();
//        this.sortAlgorithm = sortAlgorithm;
//    }

//        public int binary2Search(){
//        int[] sortedNumbers=sortAlgorithm.sort(5);
//        System.out.println("I am here");
//          return 3;
//        }

    public int binarySearch(int number){
        int[] sortedNumbers=sortAlgorithm.sort(number);
        System.out.println("I am here");
          return 3;
    }

}
