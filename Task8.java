public class Task8 {

    // Method using variable arguments
    public static int calculateSum(int... numbers) {

        int totalSum = 0;

        // Loop through each number
        for (int number : numbers) {

            int sum = 0;

            System.out.print(number + " = (");

            // Calculate the sum from 1 up to the number
            for (int i = 1; i <= number; i++) {

                sum += i;

                System.out.print(i);

                if (i < number) {
                    System.out.print(" + ");
                }
            }

            System.out.println(") = " + sum);

            // Add the result to the total
            totalSum += sum;
        }

        return totalSum;
    }

    public static void main(String[] args) {

        // Call the method with three arguments
        int result = calculateSum(4, 5, 10);

        // Display the final result
        System.out.println("-----------------------");
        System.out.println("Total Sum: " + result);
    }
}