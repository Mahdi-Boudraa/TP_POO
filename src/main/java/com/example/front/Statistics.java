package com.example.front;

import java.io.Serializable;

public class Statistics implements Serializable {
    private int index1 ;
    private int index2 ;
    private int index3 ;


    public Statistics (int index1 , int index2 , int index3) {
        setIndex1(index1);
        setIndex2(index2);
        setIndex3(index3);
    }

    public int getIndex1() {
        return index1;
    }

    public void setIndex1(int index1) {
        this.index1 = index1;
    }

    public int getIndex2() {
        return index2;
    }

    public void setIndex2(int index2) {
        this.index2 = index2;
    }

    public int getIndex3() {
        return index3;
    }

    public void setIndex3(int index3) {
        this.index3 = index3;
    }
}
