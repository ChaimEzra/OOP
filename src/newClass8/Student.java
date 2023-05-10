package newClass8;

public class Student {
    private String name;
    private int age;
    private int yearsOfExperience;
    private boolean stillStudy;
    private boolean canWork;
    private Test[] tests;
    private College whichCollege;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name ){
        this.name = name;
    }
    public double averagePerSt(){
        int marks = 0;
        int rightPoint = 0;
        double average;
        for (int i = 0; i < tests.length; i++) {
            marks += tests[i].getMark()*tests[i].getRightPoints();
            rightPoint += tests[i].getRightPoints();
        }
        average = (double) marks/rightPoint;
       return average;
    }

    public String getName() {
        return this.name;
    }
    public boolean isUni(){
        return whichCollege.isUniversity();
    }

}
