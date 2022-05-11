package lambda_practice;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class C6_Lambdada_ForLoop_Aralik_Kontrolu {

    public static void main(String[] args) {

        ilk30(30);
        System.out.println("");
        ilk30Dahil(30);
        System.out.println("");
        System.out.println("top(10,40) = " + top(10, 40));
        System.out.println("");
        System.out.println("ortalama(20,30) = " + ortalama(20, 30));
        System.out.println("");
        System.out.println("sekizeBolunen(20,30) = " + sekizeBolunen(20, 30));
        System.out.println("");
        sekizeBolunenYaz(325, 468);
        System.out.println("");
        System.out.println("sekizeBolunenTopYaz(325,468) = " + sekizeBolunenTopYaz(325, 468));
        System.out.println("");
        System.out.println("tekSayiCrpm(7, 15) = " + tekSayiCrpm(7, 15));
        System.out.println("");
        ilk10Tek(10);
        System.out.println("");
        yirmiYediveYedininKati(10);
        System.out.println("");
        System.out.println("yirmiYediveYedininKatiTopla(20) = " + yirmiYediveYedininKatiTopla(20));
    }

    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //range(int startInclusive, int endExclusive)

    public static void ilk30(int a) {
        IntStream.range(1, a).forEach(t -> System.out.print(t + " "));
    }

    //S2 1 den 30 kadar olan sayilari (30 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //rangeClosed(int startInclusive, int endInclusive)
    public static void ilk30Dahil(int a) {
        IntStream.rangeClosed(1, a).forEach(t -> System.out.print(t + " "));// a+1 de oluyor
    }


    //S3 Istenen iki deger(dahil) arasindaki sayilari toplayalim

    public static int top(int bas, int bitis) {
        return IntStream.rangeClosed(bas, bitis).sum();
    }


    //S4: 30 ile 40 arasindaki sayilarin (dahi) ortalamasini bulalim

    public static OptionalDouble ortalama(int bas, int bitis) {
        return IntStream.rangeClosed(bas, bitis).average(); // ortalama alir
    }
    //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?

    public static long sekizeBolunen(int bas, int bitis) {

        return IntStream.rangeClosed(bas, bitis).filter(t -> t % 8 == 0).count();
    }


    //S6: 325 ile 468 arasinda 8 e bolunen sayilari yazdiralim
    public static void sekizeBolunenYaz(int bas, int bitis) {

        IntStream.rangeClosed(bas, bitis).filter(t -> t % 8 == 0).forEach(t -> System.out.print(t + " "));
    }


    // S7:325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim
    public static int sekizeBolunenTopYaz(int bas, int bitis) {

        return IntStream.rangeClosed(bas, bitis).filter(t -> t % 8 == 0).sum();
    }


    // S8: 7ile 15 arasindaki tek sayilarin carpimini bulalim

    public static double tekSayiCrpm(int bas, int bitis) {
        return IntStream.rangeClosed(bas, bitis).filter(Utils::printOddElements).reduce(1, (x, y) -> x * y);
     // reduce ilk buldugu 7'yi alir 9la carpar sonrasinda sonucu 11 le carpar ve sirayla ilerler
    }

    //S9: pozitif tek sayilarin ilk 10 elemanin yazdiralim

    public static void ilk10Tek(int a ){
       IntStream.iterate(1,t->t+2).limit(10).forEach(t-> System.out.print(t+" "));
       // IntStream.rangeClosed(1,a).limit(10).filter(Methods::tekMi).forEach(Methods::yazInteger); 1 ile 10 arasi tek sayilari verir
       //limit 10 cunku 10 tane istiyor eger kullanicidan girmesini isteseydik a olmaliydi
    }


    //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yaziralim

    public static void yirmiYediveYedininKati(int a ){
        IntStream.iterate(21,t->t+7).limit(10).forEach(Methods::yazInteger);
    }


    //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim
    public static int yirmiYediveYedininKatiTopla(int a ){

        return IntStream.iterate(21,t->t+7).limit(20).sum();
    }

//iterate bize sayilari istedigimiz sekilde yineletmeyi saglar yani buradaki ornekte 7ser7ser artmayi saglar
//iterate icin bir baslangic degeri girilmeli ve artisin nasil olacagi belirtilmeli nerede biteceginide
// limit() ile belirliyoruz
}