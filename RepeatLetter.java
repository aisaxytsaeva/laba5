import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;

public class RepeatLetter {
    public static void main(String[] args) {
        char s = 'm';
        StringBuilder text = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("Text.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return; 
        }
        
        try {
            findWords(text, s);
        } catch (PatternSyntaxException e) {
            System.out.println("Ошибка синтаксиса регулярного выражения: " + e.getMessage());
        }
    }

    public static void findWords(StringBuilder text, char s) {
        String regex = "\\b" + s + "\\w*\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        boolean found = false;
        
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }
        
        if (!found) {
            System.out.println("Слова не найдены.");
        }
    }
}

