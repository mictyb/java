import org.w3c.dom.ls.LSOutput;

public class zad3 {

    public static void main(String[] args) {

        int results = 0;
        label:
        for (int i = 10; i < 23; i++) {
            for (int j = 1; true; j++) {
                if (i * j % 3 == 0) {
                    continue label;
                }
                if (i == 14) {
                    break;
                }
                System.out.println( i);
                results++;
                System.out.println( "result" + results);

            }
        }
        System.out.println(results);
    }

}



