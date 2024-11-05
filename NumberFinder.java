import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {
        String text = "the price of the 5 products is 19.99. The butter costs 2.35";
        try {
            Pattern pattern = Pattern.compile("-?\\d+(?:\\.\\d+)?");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Incorrect pattern syntax " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}