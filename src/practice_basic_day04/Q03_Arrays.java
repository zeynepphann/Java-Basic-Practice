package practice_basic_day04;

import java.util.Arrays;

public class Q03_Arrays {

    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        // 1. adim : str tanimladik
        String str ="HeySiri";

        // 2. adim : str yi ByeSiri ye donustur

        str = str.replace("Hey","Bye");

        // 3.adim : arr olustur
        String [] arr=  new String[1];
        arr[0]=str;
        System.out.println(Arrays.toString(arr));


    }
}
