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

        //Задача 4
        System.out.println("Задача 4");
        int [ ] freeMas31 = new int[1];
        freeMas31[0] = 3;
        int freeMass32 = freeMas31[0];
        System.out.println(freeMass32);

        int [ ] twoMas21 = new int [2];
        twoMas21[1] = 2;
        int twoMas22 = twoMas21[1];
        System.out.println(twoMas22);

        int [ ] oneMas11 = new int [3];
        oneMas11[2] = 1;
        int oneMas12 = oneMas11[2];
        System.out.println(oneMas12);

        //Задача 5
        System.out.println("Задача 5");
        double [] kilo11 = {1.57, 7.654, 9.986};
        kilo11[2] = 9.986;
        double kilo12 = kilo11[2];
        System.out.println(kilo12);
        System.out.println(kilo11[1]);
        System.out.println(kilo11[0]);

    }
}