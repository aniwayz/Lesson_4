import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

                    System.out.println("___task_1___");

        int skc1 = 3;
        int skc2 = 5;
        sumAndPrint(skc1, skc2);

                    System.out.println("___task_2___");

    double rezult = PISq();
            System.out.println("Reiksme:" + rezult);

                    System.out.println("___task_3___");

        System.out.println(sqr(4,3));

                    System.out.println("___task_4___");

        int[] massive = {1,3,5,7,9};
        ciklas(massive);

                    System.out.println("___task_5___");

        int min2 = 3;
        int max2 = 9;
        int graza = penktas(min2, max2);
        System.out.println(graza);

                    System.out.println("___task_6___");


    }

    public static void sumAndPrint(int x, int z) {
        int suma = x + z;
        System.out.println("Suma:" + suma);
    }

    public static double PISq() {
        return 9.8596;
    }

    public static int sqr(int a, int b) {
        return a * b;
    }

    public static void ciklas (int[] massive) {
        for (int i = 0; i < massive.length ; i++) {
            System.out.println(massive[i]);
        }
    }

    public static int penktas(int min2, int max2) {
        int sugenerotas = min2 + (int) Math.round(Math.random() * (max2 - min2));
        return sugenerotas;
    }

 // Sukurkite Funkciją kuri priima du int tipo kintamuosius, min ir max reikšmėms nustatyti ir sugeneruoja random int skaičių ir jį gražintų.





















}
