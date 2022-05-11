package lambda_practice;

// lambda da method kullanimi :
//ilk olarak class adi yazilir
//sonra  :: noktalar konur
//son olarak method secilir
//String class i sayesinde length gibi touppercase gibi methodlari kullanabiliriz
//Math classi sayesinde de sum vb methodlar kullanabiliriz

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C4_Method_Refarance_Int {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(-2,-8,-5,0,2,5,6,7,15,6,8);

        tekleriYazdir(list) ;
        System.out.println();
        ciftleriCarpiminiYazdir(list);
        System.out.println();
        negatiflerinKareToplami(list);
        System.out.println();
        poziflerinKupleriEnbuyugu(list);
    }





// S1: tekleri aralarinda bir bosluk birakarak yazdiralim

public static void tekleriYazdir( List<Integer> list){

        list.stream().filter(Utils::printOddElements).forEach(System.out::print);
        }

        // S2: ciftlerin carpimini bulalim

public static void ciftleriCarpiminiYazdir( List<Integer> list){

        Optional<Integer> toplam = list.stream().filter(Utils::printEvenElements).reduce(Math::multiplyExact);

        System.out.println(toplam);
        }


        // S3: negatiflerin kare toplamlarini  bulalim

public static void negatiflerinKareToplami( List<Integer> list){

        Optional<Integer> toplam = list.stream().filter(t-> t<0).map(Utils::printSquareElements).reduce(Integer::sum);

        System.out.println(toplam);
        }



        // S4: poziflerin kuplerinden max yazdiralim

public static void poziflerinKupleriEnbuyugu( List<Integer> list){

        Optional<Integer> toplam= list.stream().filter(t-> t>0).map(Utils ::printCubeElements).reduce(Math::max);
        System.out.println(toplam);
        }



}
