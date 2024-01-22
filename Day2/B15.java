import java.util.Scanner;

public class B15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample Input 1
        System.out.print("Enter the digits: ");
        String input1 = scanner.nextLine();
        String output1 = convertToCharacters(input1);
        System.out.println("Sample Output 1: " + output1);

        
    }

    public static String convertToCharacters(String digits) {
        StringBuilder result = new StringBuilder();

        String[] digitArray = digits.split(" ");

        for (String digit : digitArray) {
            int num = Integer.parseInt(digit);
            char character = (char) num;
            result.append(digit).append("-").append(character).append(" ");
        }

        return result.toString().trim();
    }
}