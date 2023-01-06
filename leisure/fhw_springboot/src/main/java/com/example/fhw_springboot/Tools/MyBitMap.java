package com.example.fhw_springboot.Tools;

public class MyBitMap {
    /*
    位图数据结构用于存储大量的数据，当int数据过多时，存储为int，内存不够用
    一个int是四字节，也就是32位
    位图是指用每一个bit位代表一个int数据，32位可以表示32个int值，也就是从0开始到31
    这样就可以大大节省内存
     */
    private int[] arr;

    public MyBitMap(int max) {
        this.arr = new int[(max + 32) >> 5];
    }

    public void add(int val) {
        //这个下标的元素 或上
        arr[val >> 5] = arr[val >> 5] |= 1 << (val & 63);
    }
}
