package newClass9;

public class Worker {
    private String fName;
    private String lName;
    private int salary;
    private int years;


    public Worker (String fName,String lName,int salary,int years){
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        this.years = years;
    }


    public boolean isNew(){
        boolean isNew = false;
        if (this.years <= 3){
            isNew = true;
        }
        return isNew;
    }

    public boolean isSenior(){
        boolean isSenior = false;
        if (!isNew() && this.salary >= 15000){
            isSenior = true;
        }
        return isSenior;
    }

    public String toString(){
        if (isSenior()){
            return "Worker " +this.fName+ " " +this.lName +" is senior. ";
        }else {
            return "Worker " +this.fName+ " " +this.lName +" is not senior. ";
        }
    }

    public int getSalary(){
        return this.salary;
    }
    public char getFirstLetter(){
        return this.fName.charAt(0);
    }







}
