package Interview_Questions04;

import java.util.ArrayList;

public class Soru2 {
    public static void main(String[] args) {
        // int array list oluşturun 10 elemandan oluşmalı
        // random ekle isinde void bir metod oluşturun  ve parametresi int array list olsun.
        // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
        // eğer çift sayı atarsa o elemaının yerine 111 yazsın
        // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

        ArrayList<Integer>list= new ArrayList<Integer>(); // yeni liste olusturduk
        randomEkle(list);




    }

    private static void randomEkle(ArrayList<Integer> list) {
        for (int i = 0; i <10 ; i++) {
            list.add((int) (Math.random()*20));
            // 0 ile 20'ye kadar random sayi ekler
            // integer yazdik ama double veri tipine sahip olan math.random classi hata verdiginden
            // integer a casting yaptik
            // kirmizi yere gel cast argument tikla sorunu coz

        }
        System.out.println("Random liste: " + list);
        //list uzunluk size

        int sayac=0;
        for (int i = 0; i <list.size() ; i++) { // random sayilari liste atadik
            if (list.get(i)%2==0){// listeyi getir ve olan sayilar cift mi diye kontrol et
               sayac++;
               list.set(i,111);// eger ciftse git ve bu sayiyi 111 yap
            }
        } System.out.println("111'ler eklendikten sonra random liste: " + list);

        if (sayac==0){
            System.out.println("listede cift sayi yoktur");
        }
        System.out.println("listenin son hali: " + list);

        //Random rnd = new Random(20);
        //System.out.println(rnd); referans numarasi yazdiriyor kontrol et



    }
}
