package newClass2;

public class Clock {
     private int minutes, hours ;

     public int getMinutes(){
         return minutes;
     }

     public boolean setMinutes(int m){
         if (m < 0 || m >= 60){
             minutes = 0 ;
             return  false;
         }
         else {
             minutes = m ;
             return  true;
         }

     }


     public int getHours(){
        return hours;
     }



     public boolean setHours(int h){
         if (h < 0 || h >= 24){
             hours = 0 ;
             return  false;
         }
         else {
             hours = h ;
             return  true;
         }
     }

     public void tick(){
         minutes++;
         hours += minutes / 60 ;
         minutes %= 60 ;
         hours %= 24 ;
     }

    public void show(){
         if (hours < 10){
             System.out.print("0");
         }
         System.out.print(hours + ":");
         if (minutes < 10){
             System.out.print("0");
         }
        System.out.print(minutes);
    }

}
