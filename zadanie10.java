public class Main {
    public static void main(String[] args) {

        ExtMet(met1() + met2() + met3(met4() + met5()));


    }

    public static int  ExtMet( int i) {
        System.out.println(" metoda ExtMet = " + i);
        return i;
    }
    public static int met1() {
        System.out.println(" metoda met1 ");

return 1;
    }

    public static int met2() {
        System.out.println(" metoda met2");

return 2;
    }
    public static int met3(int i) {
        System.out.println(" metoda met3  ");
return i;

    }
    public static int met4() {
        System.out.println(" metoda met4");
        return 4;

    }
    public static int met5() {
        System.out.println(" metoda met5");
        return 5;

    }

}
