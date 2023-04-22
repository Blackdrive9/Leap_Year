import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int year;
        String check;

        System.out.println("******* LEAP YEAR *******\n");

        do {
            year = insert();

            Leap l = new Leap(year);

            if (l.isLeap()) {
                System.out.println("L'anno " + year + " è bisestile");
            } else {

                System.out.println(year + " non è un anno bisestile");
            }

            System.out.println("\nVuoi continuare?(Y/n)");

            check = in.next();

        } while (check.equals("Y"));

    }

    public static int insert() {

        int t = 0;
        boolean x = false;

        do {

            try {

                System.out.print("Inserisci l'anno: ");
                t = Integer.parseInt(in.next());

                return t;

            } catch (NumberFormatException e) {
                System.out.println("Formato non valido! Inserisci un intero.\n");
            }

        } while (true);

    }

}