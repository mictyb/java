public class Main {
    public static void main(String[] args) {

        int liczba1 = 10;
        int liczba2 = 50;
        int liczba3 = 30;

        int max = 0;

        if ((liczba1 > liczba2) && ((liczba1 > liczba3))) {
            max = liczba1;
        } else if ((liczba2 > liczba1) && ((liczba2 > liczba3))) {
            max = liczba2;

        } else
            max = liczba3;

        System.out.println(" max number is " + max);

    }
}
