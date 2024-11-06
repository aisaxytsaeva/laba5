import java.util.regex.*;

public class Password {
    public static void main(String[] args) {
        String password = "1Ejuob6431jfeijfdihfdhfihfeh";
        try {
            Pattern patternUpperCase = Pattern.compile("[A-Z]");
            Matcher matcherUpperCase = patternUpperCase.matcher(password);
        
    
            Pattern patternLowerCase = Pattern.compile("[a-z]");
            Matcher matcherLowerCase = patternLowerCase.matcher(password);
        

            Pattern patternDigit = Pattern.compile("\\d");
            Matcher matcherDigit = patternDigit.matcher(password);
        

            Pattern patternLength = Pattern.compile(".{8,16}");
            Matcher matcherLength = patternLength.matcher(password);
        
        
            if (!matcherUpperCase.find()) {
                System.out.println("Пароль должен содержать хотя бы одну заглавную букву.");
            } else if (!matcherLowerCase.find()) {
                System.out.println("Пароль должен содержать хотя бы одну строчную букву.");
            } else if (!matcherDigit.find()) {
                System.out.println("Пароль должен содержать хотя бы одну цифру.");
            } else if (!matcherLength.matches()) {
                System.out.println("Длина пароля должна быть от 8 до 16 символов.");
            } else {
                System.out.println("Правильный пароль!");
            }

        }catch (PatternSyntaxException e) {
            System.out.println("Incorrect pattern syntax " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    

    }
}

