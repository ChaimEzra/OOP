package newClass8;

public class Main {
    public static void main(String[] args) {
        Student[] s1 = new Student[3];
        printStudents(s1);

    }
    public static void printStudents(Student[] students){
        for (int i = 0; i < students.length; i++) {
            if (students[i].isUni()){
                System.out.println(students[i].getName());
            }

        }
    }
}
