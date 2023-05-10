import newClass1.Child;

public class Main {
    public static void main(String[] args) {
        Child child =new Child();
        child.age();
        int[][] arr = new int[11][11];
        for (int i = 1; i < arr.length ; i++) {
            for (int j = 1; j < arr[i].length ; j++) {
                arr[i][j] = i * j ;

            }
        }
        for (int i = 1; i < arr.length ; i++) {
            for (int j = 1; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + "\t" );
            }
            System.out.println();
        }
//        newClass.Clock c1 = new newClass.Clock() ;
//
//        System.out.print("The time is : ");
//        c1.show();
//        System.out.println();
//
//        c1.setHours(68);
//        c1.setMinutes(90);
//
//        c1.show();
      //  }

    }
}
