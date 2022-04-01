package Interview_Question;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        /*
         * Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */

        Scanner scan = new Scanner(System.in );
        System.out.println("bir string gir");
        String str = scan.nextLine();

        System.out.println("bir sayi gir");
        int sayi= scan.nextInt();
        ilkSonHarf(str, sayi);

        System.out.println("girilen stringin ilk ve son harfinin istenen sayi kadar birlesik hali " +ilkSonHarf(str,sayi));

    }

    private static String ilkSonHarf(String str, int sayi) {
        String string = str.substring(0,1) + str.substring(str.length()-1); // ea

        String output ="";
        for (int i = 0; i <=sayi ; i++) { // ea dan kac tane yazcagimi soyler
            output+= string;
        }
        return output;
    }

}
