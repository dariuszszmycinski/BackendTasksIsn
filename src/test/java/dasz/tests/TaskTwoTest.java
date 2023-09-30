package dasz.tests;

import dasz.model.TaskTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTwoTest {

    @Test
    void solution() {
        assertEquals(TaskTwo.solution(new int[]{1, 2, 10, 7, 5, 3, 6, 6, 13, 0}),
                """
                        0 13
                        3 10
                        6 7
                        6 7""");
    }
}