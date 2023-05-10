package newClass3;

public class Member {
    private String firstName ;
    private String lastName ;
    private String theTeamHeBelong ;
    private String typeOfTask;
    private int howLongHeIsInTheCompany;
    private int howLongHeIsInTheField ;


    public boolean isSenior(){
        if (howLongHeIsInTheCompany >= 3 || howLongHeIsInTheField >= 5){
            return true;
        }

        return false ;
    }

}
