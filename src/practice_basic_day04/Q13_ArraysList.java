package practice_basic_day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13_ArraysList {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        //List<Integer> max = new ArrayList<>();

        int input[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;

        Arrays.sort(input);
        for (int i = input.length-n; i <input.length; i++) {

            System.out.print(input[i]+" ");
        }

    }

    }


