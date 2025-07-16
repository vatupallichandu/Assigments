package day12;

class Student {
    String name;
    int score;

    // Constructor
    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class StudentRanking {

    // Bubble sort to rank students by score (descending)
    public static void bubbleSort(Student[] students) {
        int n = students.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                // Sort in descending order
                if (students[j].score < students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        // Create array of students
        Student[] students = {
            new Student("Alice", 85),
            new Student("Bob", 95),
            new Student("Charlie", 78),
            new Student("David", 90),
            new Student("Eve", 88)
        };

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s.name + " - " + s.score);
        }

        // Sort students by score
        bubbleSort(students);

        System.out.println("\nAfter Sorting (Ranked):");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Rank " + (i + 1) + ": " + students[i].name + " - " + students[i].score);
        }
    }
}

