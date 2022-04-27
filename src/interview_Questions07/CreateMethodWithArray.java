package interview_Questions07;

import java.util.Random;

public class CreateMethodWithArray {
    public static void main(String[] args) {
        //    ||This Part Should be in Main Method||
        //
        //     -Create an array of size 5, assign some random values from 0 to 10
        //     -(use random class and for loop to assign values)
        //
        //
        //    ||You should create public static void methods fori loop (Parameter should be int Array for methods)||
        //
        //     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
        //     -2-Create a method that prints the sum of an array
        //     -3-Create a method that prints the max element of an array
        //
        //    P.S: Return type should be void because we are not returning anything just printing

        Random rand =new Random();
        int [] sayilar= new int[5];

        for (int i = 0; i < sayilar.length ; i++) {
            sayilar[i]=rand.nextInt(10);//0 ile 10 arasi sayi verir

        }

        printArray(sayilar);
        printSum(sayilar);
        printMaxValue(sayilar);


    }

    private static void printMaxValue(int[] sayilar) {
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < sayilar.length ; i++) {
            if (max<sayilar[i]){
                max=sayilar[i];
            }
        }
        System.out.println("\nmax: " +max);
    }

    private static void printSum(int[] sayilar) {
        int toplam=0;
        for (int i = 0; i <sayilar.length ; i++) {
            toplam+=sayilar[i];
        }
        System.out.print("\ntoplam:" + toplam);
    }

    private static void printArray(int[] sayilar) {
        for (int i = 0; i <sayilar.length ; i++) {
            System.out.print(+sayilar[i]+" ");

        }
    }


}
