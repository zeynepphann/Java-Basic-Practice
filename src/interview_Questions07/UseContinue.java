package interview_Questions07;

import java.util.Scanner;

public class UseContinue {
    // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
    // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String ifade= scan.nextLine();

        for (int i = 0; i <ifade.length() ; i++) {
            if (ifade.charAt(i)=='a' || ifade.charAt(i)==' ') // suslu parantez yok
                                                              // a yada bosluk icerirse
                 continue; // bu satir calistiginda dongnun basina gider cunku a veya " " var iken cikti istemiyor

                 System.out.println(ifade.charAt(i));
        }
    }

}
