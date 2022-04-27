package interview_Questions07;

import java.util.Scanner;

public class TreeShape {
    public static void main(String[] args) {
        // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */

        Scanner scan= new Scanner(System.in);
        System.out.println("tac uzunlugunu ve govde uzunlugunu giriniz");
        int tac = scan.nextInt();
        int govde = scan.nextInt();

        String yaz=" ";
        for (int i = 0; i <tac; i++) {
            yaz+="^";
            System.out.println(yaz);
        }

        for (int i = 0; i <govde ; i++) {
            System.out.println("|||");

        }

    }
}
