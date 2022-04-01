package practice_basic_day04;

public class Q02_Arrays {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */


        int input[]= {1,2,3,4,5,6,7};
        double toplam=0;

        for (int i = 0; i <input.length ; i++) {
            toplam+=input[i]; // arrayin her bir elemani oldugu icin input [i] diyoruz



        }
        double ortalama= toplam /input.length;
        System.out.println("ortalama: " + ortalama);
        System.out.println("ortalamadan buyuk olan elemanlar :");

        for (int i = 0; i <input.length ; i++) {
            if (input[i]> ortalama){
                System.out.println(input[i]+ " ");

            }

        }



    }
}
