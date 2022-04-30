package interview_Questions08_Cozum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q06_AddedOrNotTask {
    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarli eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin

    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(3);

        int tekrarliElemanSayisi=0;

        Set<Integer> uniqeElemanlar=new HashSet<>();

        List<Integer> tekrarliElemanlar=new ArrayList<>();

        for (int i = 0; i <sayilar.size() ; i++) {
            boolean ekliMi=uniqeElemanlar.add(sayilar.get(i));//unique elemanlar listesinden i yi getir ekli mi degil mi bak
          if (!ekliMi){ //uniqe elemanlara eklenmediyse o eleman dublicate tir
              tekrarliElemanSayisi++;//bu durumda dublicate sayisi 1 artar
              tekrarliElemanlar.add(sayilar.get(i));
          }

        }
        System.out.println("tekrarliElemanlar = " + tekrarliElemanlar);
        System.out.println("tekrarliElemanSayisi = " + tekrarliElemanSayisi);

    }
}
