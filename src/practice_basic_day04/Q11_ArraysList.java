package practice_basic_day04;

import javax.imageio.ImageTranscoder;
import java.util.*;

public class Q11_ArraysList {

    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        Random rnd=new Random();
        int sayi=rnd.nextInt(100);


        List<String> kullaniciAdi= new ArrayList<>();
        // 1. adim
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= scan.nextLine();

        // 2. adim

        String isim1[]=isim.split(" ");

        //3.adim
        if (!kullaniciAdi.equals(isim1)){
            System.out.println(isim1);
        }else{
            System.out.println(isim1+ " " + sayi);
        }

    }
}
