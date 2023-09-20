import org.w3c.dom.ls.LSOutput;
import java.util.Random;
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

        int min = 1;
        int max = 5;
        int length = 10;
        int []rezultatas = massive2(min, max, length);
        for (int i = 0; i < rezultatas.length; i++) {
            System.out.print(rezultatas[i]);
        }
                    System.out.println();
                    System.out.println("___task_7___");










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


    public static int[] massive2(int min, int max, int length) {
        Random rand = new Random();
        int[] masyvas = new int[length];
        for (int i = 0; i < masyvas.length ; i++){
        masyvas[i] = rand.nextInt((max - min + 1)) + min;
        }
        return masyvas;
        }

// Sukurkite Funkciją kuri panaudotų 6tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.

    public static int arraysum

    }


 //   }
















}
