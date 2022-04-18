package Interview_Questions04;

import java.util.ArrayList;
import java.util.Arrays;

public class Soru5 {
    public static void main(String[] args) {
        /*
Problem Tanımı :
getSum isminde bir method oluşturun.
Parametresi ArrayList'tir.
Dizideki tüm $ ları kaldır ve tüm sayıları topla
return yaptğımız veri tipi 'int' olmalıdır.
sonuç 0'dan küçükse, -1 yazdırın.

Örnek1:
ArrayList = $13, $15, $20
Cevap = 48 olmalı

Örnek 2 :
ArrayList= $-13, $0, $0
Cevap = -1 olmalı.
 */
        ArrayList<String> arrlist = new ArrayList<>(Arrays.asList("$13", "$40", "$60")); //otomatik atama yapmamizi sagliyor

        System.out.println( "toplam : "+ getSume(arrlist));



    }

    private static int getSume(ArrayList<String> arrlist) {
        int toplam=0;
        for (String each:arrlist
             ) {
          String str = each.replace("$","");
          toplam+= Integer.parseInt(str);// stringi integera cevir

        }
        if(toplam<0){
            return -1;

        }else return toplam;

    }
}
