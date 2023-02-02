package com.ivoyant;


public class additions {
    public Integer  add(Integer[] a) {
        int sum=0;
        for(Integer i: a) {
            sum = sum + i;
        }
        return sum;
    }

}
