package dasz.tests;

import dasz.model.TaskOne;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {

    @org.junit.jupiter.api.Test
    void solution() {
        assertEquals(TaskOne.solution(new int[]{1, 10, 20, 20, 2, 5}),
                "1 2 5 10 20\n" +
                "count: 6\n" +
                "distinct: 5\n" +
                "min: 1\n" +
                "max: 20");
    }
}