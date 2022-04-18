package practice_basic_day06;

public class Q02_ForEach02 {
    // String[] list = {"fruits", "vegetables", "meat", "milk"};
    // print array with for each loop
    // print length of each element

    // Part 2:
    // Print all the elements from array using for eachLoop
    // If an element starts with 'v' then quit the loop
    public static void main(String[] args) {
        String[] arr= {"fruits", "vegetables", "meat", "milk"};
        for (String w: arr
             ) {
            System.out.print(w + ": " );
            System.out.print(w.length()+" ");
        }
        System.out.println(" ");

        for (String item: arr
             ) {
            if (item.startsWith("v")){
                break;
            }
            System.out.println(item);
        }
    }
}
