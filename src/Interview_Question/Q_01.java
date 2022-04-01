package Interview_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {

        /*
  Kullanicidan bir String aliniz.
  String'de var olan her character'in sayisini ekrana yazdiriniz.
  Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
         abaa   ==> a=3  b=1
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String str= scan.nextLine();

        // split()
        String arr[]= str.split(""); // her bir karakteri ayirir

        System.out.println(Arrays.toString(arr)); //[a, b, a, c, b, d, c, d, d, d]

        //short()
        Arrays.sort(arr); // siralama kucukten buyuge a'dan z'ye
        System.out.println(Arrays.toString(arr)); //[a, a, b, b, c, c, d, d, d, d]

        // sayac olustur
        int counter=0;

        for (int i = 1; i <arr.length ; i++) { // 1 den baslamamızın sebebi en son
            // karakterde karsilastirilacak bir sey kalmadigi icin bir öncekiyle karsılastırmak istiyoruz o yuzden
            // i-1 kullaniyoruz ki son karakteri bir oncekiyle karsilastirabilelim
            if(arr[i-1].equals(arr[i])){ // 1. ve 2. element birbirine esit mi i=1 i+1=2
                counter++;

            }else{
                System.out.println(arr[i-1] + " sayisi " +(counter+1 ));
                counter=0;
            }
            if (i==arr.length-1){// en sona geldiginde
                System.out.println(arr[i]+ " sayisi " + (counter+1));
            }
        }













    }
}
