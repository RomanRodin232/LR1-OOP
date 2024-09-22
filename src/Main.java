import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = in.nextLine();
        String[] filter = {".",",","!",":",";","?","{","}","[","]","(",")","'","/","-"};
        for (int i = 0; i < 15; i++){
            String text1 = text.replace(filter[i], " ");
            text = text1;
        }
        String[] words = text.split(" ");
        Map<String, Integer> kolvo = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            if (words[i] != "") {
                if (kolvo.containsKey(words[i])) {
                    kolvo.put(words[i], kolvo.get(words[i]) + 1);
                }
                else {
                    kolvo.put(words[i], 1);
                }
            }
        }
        for (String key : kolvo.keySet())
            System.out.println(key + ":" + kolvo.get(key));
    }
}