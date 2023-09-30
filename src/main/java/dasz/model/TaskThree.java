package dasz.model;

public class TaskThree {
    public static int solution(int n, int[][] input) {
        int connections = 2 * n; //maximum numbers of graphs connections, *2 because connection is two-way
        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue; //skip comparing with the same input row
                if (input[i][0] == input[j][0] || input[i][0] == input[j][1]) { //check if first number appears in other row
                    for (int k = 0; k < n; k++) { //check if both numbers appear in different rows
                        if (k == i || k == j) continue; //skip comparing with itself
                        if (input[i][1] == input[k][0] || input[i][1] == input[k][1]) {
                            connections--;
                            break;
                        }
                    }
                    connections--;
                    continue outer;
                } else if (input[i][1] == input[j][0] || input[i][1] == input[j][1]) { //check if only second number appear in other row
                    connections--;
                    continue outer;
                }
            }
        }
        return connections / 2;
    }
}
