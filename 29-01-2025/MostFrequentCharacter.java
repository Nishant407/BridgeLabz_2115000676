import java.util.HashMap;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        char mostFrequentChar = findMostFrequentCharacter(input);
        
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
    
    public static char findMostFrequentCharacter(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        char mostFrequent = str.charAt(0);
        int maxCount = 0;
        
        for (char c : frequencyMap.keySet()) {
            if (frequencyMap.get(c) > maxCount) {
                maxCount = frequencyMap.get(c);
                mostFrequent = c;
            }
        }
        
        return mostFrequent;
    }
}
