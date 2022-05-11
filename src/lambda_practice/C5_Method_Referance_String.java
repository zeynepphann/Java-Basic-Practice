package lambda_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C5_Method_Referance_String {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Elma", "Muz", "Portakal", "Cilek", "Limon");
        tumHarflerBuyuk(list);
        System.out.println();
        stringSirala(list);
        System.out.println();
        eIleBaslayanlar(list);

    }
    // S1: Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim

    public static void tumHarflerBuyuk(List<String> list){

        list.stream().map(String ::toUpperCase).forEach(Utils::printElements);

    }

        //S2: Stringleri uzunluklarina gore siralayip yaziniz

    public static void stringSirala(List<String> list){

        list.stream().sorted(Comparator.comparingInt((String ::length))).forEach(Utils::printElements);

    }


        //S3: E ILE Baslayanlari yazdiralim

    public static void eIleBaslayanlar(List<String> list){

        list.stream().filter(t-> t.startsWith("e") || t.startsWith("E")).forEach(Utils ::printElements);

    }

}
