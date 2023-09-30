package dasz.model;

import java.util.Arrays;

public class TaskTwo {
    public static String solution(int[] input) {
        input = Arrays.stream(input).sorted().toArray();
        int wantedSumResult = 13;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == wantedSumResult) {
                    sb.append(input[i]).append(" ").append(input[j]).append("\n");
                }
            }
        }
        return sb.toString().trim();
    }
}
