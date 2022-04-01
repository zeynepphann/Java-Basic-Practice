package Interview_Question;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        /*
Ask user enter a positive number and check if it is prime or not
Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
 */

        Scanner scan = new Scanner(System.in );
        System.out.println("bir string gir");
        int sayi = scan.nextInt();

        boolean asalMı= true;
        for (int i = 2; i <sayi ; i++) { // 1 e bolunurse asal olmaz
            if (sayi%i==0){
                asalMı= false;
                break;
            }
        }
        if(asalMı){
            System.out.println("sayi asaldir");
        }else {
            System.out.println("sayi asal degildir");
        }




    }
}
