package newClass17;

public class Study {
    private String title;
    private String nameOfTheHead;
    private int numberOfStudents;
    private Course[] options;

    public Study(String title, String nameOfTheHead, int numberOfStudents, Course[] options) {
        this.title = title;
        this.nameOfTheHead = nameOfTheHead;
        this.numberOfStudents = numberOfStudents;
        this.options = options;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameOfTheHead() {
        return nameOfTheHead;
    }

    public void setNameOfTheHead(String nameOfTheHead) {
        this.nameOfTheHead = nameOfTheHead;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Course[] getOptions() {
        return options;
    }

    public void setOptions(Course[] options) {
        this.options = options;
    }
}
