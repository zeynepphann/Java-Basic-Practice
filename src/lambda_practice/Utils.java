package lambda_practice;

public class Utils {
    public static int printSquareElements(int a){

        return a*a;
    }

    public static boolean printEvenElements(int a){

        return a%2==0;
    }
    public static boolean printOddElements(int a){

        return a%2!=0;
    }

    public static void printElements(Object o){

        System.out.print(o + " ");
    }

    public static int printCubeElements(int a){
        return a*a*a;
    }

    public static int printMinElement(int a, int b){

        return a<b? a:b;


    }
    public static char getLastChar (String str){

        return str.charAt(str.length()-1);
    }

}
