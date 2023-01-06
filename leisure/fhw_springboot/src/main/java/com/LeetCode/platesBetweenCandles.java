package com.LeetCode;

public class platesBetweenCandles {
    public static void main(String[] args) {
        String s = s = "**|**|***|";
        int[][] quires = new int[2][];
        quires[0] = new int[2];
        quires[0][0] = 2;
        quires[0][1] = 5;
        quires[1] = new int[2];
        quires[1][0] = 5;
        quires[1][1] = 9;
        int[] answer = platesBetweenCandlesSlt(s, quires);
    }
    public static int[] platesBetweenCandlesSlt(String s, int[][] quires) {
        int []answer = new int[quires.length];
        int answerIndex= 0;
        for (int[] quire : quires) {
            int leftWall = -1;
            int rightWall = -1;
            for (int left = quire[0]; left < quire[1]; left++) {
                if (s.charAt(left) == '|') {
                    leftWall = left;
                    break;
                }
            }
            for (int right = quire[1]; right > quire[0]; right--) {
                if (s.charAt(right) == '|') {
                    rightWall = right;
                    break;
                }
            }
            //没有蜡烛，直接下个查询
            if (leftWall == -1 || rightWall == -1 || leftWall >= rightWall) {
                answer[answerIndex] = 0;
                answerIndex++;
                continue;
            }
            //有蜡烛，看有多少个
            int res = 0;
            for (int i = leftWall+1; i< rightWall; i++) {
                if (s.charAt(i) == '*') {
                    res++;
                }
            }
            answer[answerIndex] = res;
            answerIndex++;
        }
        return answer;
    }
}
