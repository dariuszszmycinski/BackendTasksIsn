package dasz.userInterface;

import dasz.model.TaskOne;
import dasz.model.TaskThree;
import dasz.model.TaskTwo;

import java.util.Scanner;

public class Application {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        boolean runOptionsLoop = true;
        while (runOptionsLoop) {
            int option = readStartingOption(4, scanner);
            switch (option) {
                case 1 -> readInputForTaskOne(scanner);
                case 2 -> readInputForTaskTwo(scanner);
                case 3 -> readInputForTaskThree(scanner);
                default -> {
                    runOptionsLoop = false;
                    System.out.println("See you later!");
                }
            }
        }
        scanner.close();
    }

    private static int readStartingOption(int range, Scanner scanner) {
        int input = -1;
        while (input == -1) {
            System.out.println("""
                    Choose task to check:
                    1 - check task one
                    2 - check task two
                    3 - check task three
                    4 - exit
                    """);
            String line = scanner.nextLine();
            try {
                input = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.err.println("Choose number!");
                continue;
            }
            if (input > range || input < 0) {
                input = -1;
                System.err.println("Number must be between 1 and " + range);
            }
        }
        return input;
    }

    private static void readInputForTaskOne(Scanner scanner) {
        boolean dataReceived = false;
        while (!dataReceived) {
            int[] dataForTask = readIntsArray(scanner);
            if (dataForTask == null) continue;
            System.out.println("Task one result:\n");
            System.out.println(TaskOne.solution(dataForTask) + "\n");
            dataReceived = true;
        }
    }

    private static int[] readIntsArray(Scanner scanner) {
        System.out.println("Enter list of numbers separated with spaces, like \"1 2 3\":\n");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] dataForTask = new int[inputArray.length];
        try {
            for (int i = 0; i < inputArray.length; i++) {
                dataForTask[i] = Integer.parseInt(inputArray[i]);
            }
        } catch (NumberFormatException e) {
            System.err.println("Wrong data format!");
            return null;
        }
        return dataForTask;
    }

    private static void readInputForTaskTwo(Scanner scanner) {
        boolean dataReceived = false;
        while (!dataReceived) {
            int[] dataForTask = readIntsArray(scanner);
            if (dataForTask == null) continue;
            System.out.println("Task two result:\n");
            System.out.println(TaskTwo.solution(dataForTask) + "\n");
            dataReceived = true;
        }
    }

    private static void readInputForTaskThree(Scanner scanner) {
        boolean dataReceived = false;
        while (!dataReceived) {
            System.out.println("How many number pairs is there? Enter number:\n");
            String input = scanner.nextLine();
            int n;
            try {
                n = Integer.parseInt(input);
            } catch (Exception e) {
                System.err.println("Wrong data format!");
                continue;
            }
            int[][] array = new int[n][2];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter number pair #" + (i + 1) + " separated with a space, like \"1 2\":\n");
                String line = scanner.nextLine();
                try {
                    String[] inputArray = line.split(" ");
                    if (inputArray.length > 2) throw new IllegalArgumentException();
                    array[i][0] = Integer.parseInt(inputArray[0]);
                    array[i][1] = Integer.parseInt(inputArray[1]);
                } catch (Exception e) {
                    System.err.println("Wrong data format!");
                    i--;
                }
            }
            System.out.println("Task three result:\n");
            System.out.println(TaskThree.solution(n, array) + "\n");
            dataReceived = true;
        }
    }
}
