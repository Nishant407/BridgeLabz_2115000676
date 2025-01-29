public class WordReplacer {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        String sentence = "Hello world, welcome to the world of programming!";
        String oldWord = "world";
        String newWord = "universe";

        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println(updatedSentence);
    }
}
