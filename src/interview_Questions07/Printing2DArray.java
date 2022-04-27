package interview_Questions07;

import java.util.Arrays;

public class Printing2DArray {
    // Print 2D String array using loops

    public static void main(String[] args) {
       String arr[][]= {{"abc","def","ghi"}, {"jkl","mno","prs"}};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println(arr[i][j]);
            }

        }
        System.out.print(Arrays.deepToString(arr));


    }


}
