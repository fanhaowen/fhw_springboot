package com.LeetCode;

public class convertToBase7 {
    //20220307 7进制 七进制
    public static void main(String[] args) {
        String res = convertToBase7(80);
        System.out.println(res);
    }

    public static String convertToBase7(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        if (num < 0) {
            stringBuilder.append('-');
        }
        int bit = 1;
        int f = num;
        while (f / 7 != 0) {
            bit *= 7;
            f = f/7;
        }
        while (bit != 0) {
            System.out.println("bit:"+bit+"; num:"+num);
            stringBuilder.append(Math.abs(num/bit));
            System.out.println(stringBuilder.toString());
            num %= bit;
            bit /= 7;
        }
        return stringBuilder.toString();
    }
}
