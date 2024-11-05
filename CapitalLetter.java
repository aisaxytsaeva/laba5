import java.util.regex.*;

public class CapitalLetter {
    public static void main(String[] args) {
        String text = "AaejA Dfo lR mF FFlkO";
        Pattern pattern = Pattern.compile("(\\p{Ll})(\\p{Lu})");
        Matcher matcher = pattern.matcher(text);
        String result = matcher.replaceAll("!$1$2!");
        System.out.println(result);

        
    }
    

}