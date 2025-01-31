import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);
        scanner.close();
        
        String modifiedString = removeCharacter(input, charToRemove);
        
        System.out.println("Modified String: " + modifiedString);
    }
    
    public static String removeCharacter(String str, char ch) {
        char[] chars = new char[str.length()];
        int index = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                chars[index++] = str.charAt(i);
            }
        }
        
        return new String(chars, 0, index);
    }
}
