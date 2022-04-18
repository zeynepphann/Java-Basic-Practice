package interviewQuestions6;


import java.util.ArrayList;
import java.util.Arrays;

public class Q06_DuplicateValue {
       /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */
       public static void main(String[] args) {
           String str = "Javaisalsoeasy";
           char[]arr= str.toCharArray();
           System.out.println(Arrays.toString(arr));

           ArrayList<Character> output = new ArrayList<>();

           for (int i = 0; i <arr.length ; i++) {
               for (int j = i+1; j <arr.length ; j++) {
                   if (arr[i]==arr[j]&& !output.contains(arr[j])){
                       System.out.println(arr[j]);
                       output.add(arr[j]);
                   }
               }

           } System.out.println(output);
       }





}

