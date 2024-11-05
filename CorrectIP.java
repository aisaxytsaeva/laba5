
import java.util.regex.*;

public class CorrectIP {
    public static void main(String[] args) {
        String IP = "123.59.85.235";
        try{
            Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}$");
            Matcher matcher = pattern.matcher(IP);
            if (matcher.matches()){
                System.out.println("Correct IP");
            }else{
                System.out.println("Incorrect IP");
            }

        }catch (PatternSyntaxException e) {
            System.out.println("Incorrect pattern syntax " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}