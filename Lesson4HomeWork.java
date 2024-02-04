public class Lesson4HomeWork {
    public static void main(String[] args) {
        System.out.println("15: ? " + byFive(15));
        System.out.println("11: ?" + bySeven(11));
        System.out.println("1600: ? " + byLeapYear(1600));
        System.out.println("1700: ?" + byLeapYear(1700));


    }


    public static boolean byFive(int a) {
        boolean isbyFive;
        if ((a % 5) == 0) isbyFive = true;
        else isbyFive = false;
        return isbyFive;
    }

    public static boolean bySeven(int b) {
        boolean isbySeven;
        if ( (b % 7) == 0) isbySeven = true;
        else isbySeven = false;
        return isbySeven;



    }
    public static boolean byLeapYear (int Year) {
        boolean isbyLeapYear;
        if ( (Year % 400 == 0)) isbyLeapYear = true;
        else isbyLeapYear = false;
        return isbyLeapYear;


    }



}








