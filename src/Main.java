
public class Main {
    public static void main(String[] args) {
        String textExample = new String("ABC DFG HIJ");
        int wordCount = textExample.split(" ").length;
        System.out.println("Count of words in the text - " + wordCount);
        for (String word : textExample.split(" ")) {
            for (int j = word.length() - 1; j >= 0; --j) {
                System.out.print(word.charAt(j));
            }
            System.out.print(" ");
        }
    }
}