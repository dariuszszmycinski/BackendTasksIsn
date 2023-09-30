package dasz.tests;

import dasz.model.TaskThree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskThreeTest {

    @Test
    void data1() {
        assertEquals(2, TaskThree.solution(3, new int[][]{{4, 3},{1, 4},{5, 6}}));
    }

    @Test
    void data2() {
        assertEquals(2, TaskThree.solution(3, new int[][]{{1, 2},{2, 3},{4, 5}}));
    }

    @Test
    void data3() {
        assertEquals(1, TaskThree.solution( 4, new int[][]{{1, 2},{2, 3},{4, 5}, {3, 4}}));
    }

    @Test
    void noConnections() {
        assertEquals(4, TaskThree.solution( 4, new int[][]{{9,8},{6, 7},{4, 5}, {3, 2}}));
    }

    @Test
    void biggerNumbers() {
        assertEquals(4, TaskThree.solution( 8, new int[][]{{1,88},{2, 101},{99, 2}, {333, 1},{3,8888},{9, 10110001},{666, 666}, {666, 8888}}));
    }
}