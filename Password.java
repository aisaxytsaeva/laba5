import java.util.regex.*;

public class Password {
    public static void main(String[] args) {
        String password = "1Ejuob6431";
        try {
            Pattern pattern = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])[A-Za-z0-9]{8,16}");
            Matcher matcher = pattern.matcher(password);
            if(matcher.matches()){
                System.out.println("Correct password");
            }else{
                System.out.println("Incorrect password");
            }
        }catch (PatternSyntaxException e) {
            System.out.println("Incorrect pattern syntax " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    

    }
}