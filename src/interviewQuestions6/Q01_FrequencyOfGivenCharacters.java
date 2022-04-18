package interviewQuestions6;

public class Q01_FrequencyOfGivenCharacters {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */
    public static void main(String[] args) {
        String str = "AAABBCDD";
        frekans(str);

   }

   private static void frekans(String str){

        int sayac=0;
        String output="";
       for (int i = 0; i <str.length() ; i++) { //i=kiyas edilen harfimiz
           for (int j = i; j <str.length()-1 ; j++) { //j= kiyas eden harf, onun icin i ile baslamk gerek
            if (str.substring(i,i+1).equals(str.substring(j,j+1))){
                sayac++;
            }

            }if(!output.contains(str.substring(i,i+1))){ // eger kiyas edilen harf output da yoksa
                   output+=str.substring(i,i+1) + sayac;
            }else sayac=0; //tekrar etmeyen harf icin 0 yazdik ki


       }System.out.println("output: " + output);


   }



}
