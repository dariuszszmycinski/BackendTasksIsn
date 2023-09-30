package dasz.model;

import java.util.Objects;
import java.util.TreeSet;

public class TaskOne {
    public static String solution(int[] input) {
        StringBuilder sb = new StringBuilder();
        TreeSet<Integer> sortedAndSingleNumbers = new TreeSet<>();
        for (int i : input) sortedAndSingleNumbers.add(i);
        for (Integer i : sortedAndSingleNumbers) {
            sb.append(i);
            if (!Objects.equals(i, sortedAndSingleNumbers.last())) sb.append(" ");
        }
        sb.append("\n");
        sb.append("count: ").append(input.length).append("\n");
        sb.append("distinct: ").append(sortedAndSingleNumbers.size()).append("\n");
        sb.append("min: ").append(sortedAndSingleNumbers.first()).append("\n");
        sb.append("max: ").append(sortedAndSingleNumbers.last());
        return sb.toString();
    }
}

