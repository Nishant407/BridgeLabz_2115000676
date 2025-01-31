import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String toggledString = toggleCase(input);
        
        System.out.println("Toggled case string: " + toggledString);
    }
    
    public static String toggleCase(String str) {
        char[] chars = str.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        
        return new String(chars);
    }
}
