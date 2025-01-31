import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String result = removeDuplicates(input);
        
        System.out.println("String after removing duplicates: " + result);
    }
    
    public static String removeDuplicates(String str) {
        char[] chars = str.toCharArray();
        char[] result = new char[str.length()];
        int index = 0;
        
        for (int i = 0; i < chars.length; i++) {
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (chars[i] == result[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[index++] = chars[i];
            }
        }
        
        return new String(result, 0, index);
    }
}
