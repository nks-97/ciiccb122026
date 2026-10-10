import java.util.Scanner;
public class Task4{


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any value: ");
        StringBuilder inputedValue = new StringBuilder(scanner.nextLine());

        System.out.println(inputedValue.toString().equals(inputedValue.reverse().toString())? "palin" : "not palin");

    }
}