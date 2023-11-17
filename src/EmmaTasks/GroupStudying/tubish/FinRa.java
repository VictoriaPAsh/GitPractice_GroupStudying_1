package EmmaTasks.GroupStudying.tubish;

public class FinRa {
    public static void main(String[] args) {
        tugbaFinra();
    }

    public static void tugbaFinra() {

        for (int i = 1; i <= 30; i++) {
            System.out.println((i % 3 == 0 && i % 5 == 0) ? "FINRA" : (i % 3 == 0) ? "FIN" : (i % 5 == 0) ? "RA" : i);
        }
    }
}
