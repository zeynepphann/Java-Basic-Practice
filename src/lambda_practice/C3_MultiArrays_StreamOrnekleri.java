package lambda_practice;

            //multi arrayleri cevirirken flapMap kullaniriz yapilis sekli iki turludur
            //1) lamda kullanarak
            // Arrays.stream(arr).flatMap(t->Arrays.stream(t))
            //2) method ile
            // Arrays.stream(arr).flatMap(Arrays::stream)
            // BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3_MultiArrays_StreamOrnekleri {
    public static void main(String[] args) {
        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "Limon"},
                {"Havuc", "Erik"}
        };

        System.out.println(listeleme(arr));
        ciftYazdirma(arr);
        System.out.println("EListe(arr) = " + EListe(arr));
        kIleBiten(arr);


    }

    // S1 : tum elemanlari list yapalim
    // flapmap cift boyuttan cikarmak icin kullaniliyor
    public static List<String> listeleme(String[][] arr) {
        return Arrays.stream(arr).flatMap(t -> Arrays.stream(t)).collect(Collectors.toList());

    }


    // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdiralim

    public static void ciftYazdirma(String[][] arr) {
        Arrays.stream(arr).flatMap(t -> Arrays.stream(t)).filter(t -> t.startsWith("E")).map(t -> t + t).forEach(t -> System.out.println(t));

    }

    // S3: E ile baslayan elemanlari liste olarak yazdiralim
    public static List<String> EListe(String[][] arr) {
        return Arrays.stream(arr).
                flatMap(t -> Arrays.stream(t)).
                filter(t -> t.toLowerCase().startsWith("e")).
                collect(Collectors.toList());

    }


    //S4 : k ile bitenlerin sonuna '*' ekleyelim
    public static void kIleBiten(String[][] arr) {
              Arrays.stream(arr).
                flatMap(t -> Arrays.stream(t)).
                filter(t -> t.endsWith("k")).map(t -> t + "*").forEach(t-> System.out.print(t+ " "));

    }
}
