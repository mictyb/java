public class Main {
    public static void main(String[] args) {


        double Year = 1900;

        if ((Year % 4 == 0) && ( Year%100 != 0 ) || ( Year%400 == 0 )) {
            System.out.println( " TAK");

        }
        else
            System.out.println( "nie");

    }
}
