package arraysquiz22.pkg02;

import java.util.Scanner;

public class ArraysQuiz2202 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] studentNames = {"Mateo", "Lucas", "Jean", " Carlos ", "David ", "Juan", "Luis", "Marcos", "Pablo", "Adrian"};
        int studentNumbers;
        int i;

        do {
            System.out.print("Number of students in the class: ");
            studentNumbers = sc.nextInt();
        } while (studentNumbers <= 0);

        double[] grades = new double[studentNumbers];

        for (i = 0; i < grades.length; i++) {
            System.out.print("Mateo" + " Final note: ");
            grades[i] = sc.nextDouble();
            System.out.print("Lucas" + " Final note: ");
            grades[i] = sc.nextDouble();
            System.out.print("Jean" + " Final note: ");
            grades[i] = sc.nextDouble();
            System.out.print("Carlos" + " Final note: ");
            grades[i] = sc.nextDouble();
            System.out.print("David" + " Final note: ");
            grades[i] = sc.nextDouble();
            System.out.print("Juan" + " Final note: ");
            grades[i] = sc.nextDouble();
            System.out.print("Luis" + " Final note: ");
            grades[i] = sc.nextDouble();
            System.out.print("Marcos" + " Final note: ");
            grades[i] = sc.nextDouble();
            System.out.print("Pablo" + " Final note: ");
            grades[i] = sc.nextDouble();
            System.out.print("Adrian" + " Final note: ");
            grades[i] = sc.nextDouble();
                   }
for (String students : studentNames) {
            System.out.println("Final note -> " + students);
        System.out.println("studentNames " + (i + 1) + " Final note: " + grades[i]);
    }

}
    }