import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder inputs = new StringBuilder();


        System.out.println("Input First Number:");
        int valA = Integer.parseInt(scan.nextLine());
        System.out.println("Input Second Number:");
        int valB = Integer.parseInt(scan.nextLine());
        scan.nextLine();
        System.out.println("Input Third Number:");
        int valC = Integer.parseInt(scan.nextLine());
        scan.nextLine();

        if (valA ==valB && valB == valC){
            System.out.println("All number are equal");
        }else{
            int[] numbers = {valA, valB, valC};
            Arrays.sort(numbers);
            int lastIndex = numbers.length-1;
            System.out.println(numbers[lastIndex]);
        }
    }
}
