
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

        System.out.println(multiplication(4,3));

                    System.out.println("___task_4___");

        int[] massive = {1,3,5,7,9};
        ArrayPrint(massive);
        System.out.println();

                    System.out.println("___task_5___");

        int min2 = 3;
        int max2 = 9;
        int graza = randomas(min2, max2);
        System.out.println(graza);

                    System.out.println("___task_6___");

        int min = 1;
        int max = 5;
        int length = 5;
        int []rezultatas = Array2(min, max, length);
        for (int i = 0; i < rezultatas.length; i++) {
            System.out.print(rezultatas[i]);
        }
                    System.out.println();

                    System.out.println("___task_7___");

        int [] RandArray = rezultatas;
        int ArraySumm = CalculateArraySum(RandArray);
        System.out.println(ArraySumm);

                    System.out.println("___task_8___");

        int [] AverageValue1 = rezultatas;
        double AverageValueSumm = AverageArrayValue(AverageValue1);
        for (int skaicius : AverageValue1) {
            System.out.print(skaicius + " ");
        }
        System.out.println();
        System.out.println("Masyvo vidurkis: " + AverageValueSumm);

                    System.out.println("___task_9___");

        int RectangleDimWide = randomas(min2, max2);
        int RectangleDimLong = randomas(min2, max2);
        RectangleDrawing(RectangleDimWide,RectangleDimLong);

                    System.out.println("___task_10___");










    }

    public static void sumAndPrint(int x, int z) {
        int suma = x + z;
        System.out.println("Suma:" + suma);
    }

    public static double PISq() {
        return 9.8596;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static void ArrayPrint (int[] insideMassive) {
        for (int i = 0; i < insideMassive.length ; i++) {
            System.out.print(insideMassive[i]);
        }
    }

    public static int randomas (int min2, int max2) {
        int sugenerotas = min2 + (int) Math.round(Math.random() * (max2 - min2));
        return sugenerotas;
    }


    public static int[] Array2 (int min, int max, int length) {
        Random rand = new Random();
        int[] masyvas = new int[length]; // one of standart massive creation
        for (int i = 0; i < masyvas.length ; i++){
        masyvas[i] = randomas(min, max);
        }
        return masyvas;
        }

    public static int CalculateArraySum (int[] mass) {

        int summ = 0;
        for (int numberz : mass) {
            summ += numberz;
        }
        return summ ;
    }

   public static double AverageArrayValue (int[] mass) {
    return (double) CalculateArraySum (mass) / mass.length;
   }

 //   public static int RectangleDimensions (int Mylength, int Mywidth) {

    public static void RectangleDrawing (int Wide, int Long ) {
        for (int i = 0; i < Wide; i++) {
            for (int j = 0; j < Long; j++) {
                System.out.print("*");
            }
             System.out.println();
        }
    }









// Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis. Pirmas int - išoriniam ciklui, antras vidiniam.

// isnumeric - supranta ir skaicius ar numeris



























}
