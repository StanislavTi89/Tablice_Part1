public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы_Часть1!");

        //Задача 1
        System.out.println("Задача 1");
        int [ ] bigBox = {5, 6, 12};
        bigBox [0] = 5;
        int bigBox1 = bigBox[0];
        System.out.println(bigBox1);
        System.out.println(bigBox[1]);
        System.out.println(bigBox[2]);

        //Задача 2
        System.out.println("Задача 2");
        int [ ] oneMas = new int [1];
        oneMas [0] = 1;
        int oneMas1 = oneMas [0];
        System.out.println(oneMas1);

        int [ ] twoMas = new int [2];
        twoMas [1] = 2;
        int twoMas1 = twoMas [1];
        System.out.println(twoMas1);

        int [ ] freeMas = new int[3];
        freeMas[2] = 3;
        int freeMass1 = freeMas [2];
        System.out.println(freeMass1);

        //Задача 3
        System.out.println("Задача 3");
        double [] kilo = {1.57, 7.654, 9.986};
        kilo [0] = 1.57;
        double kilo1 = kilo[0];
        System.out.println(kilo1);
        System.out.println(kilo[1]);
        System.out.println(kilo[2]);


    }
}