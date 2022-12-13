package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex001 {
    private static final Pattern pattern = Pattern.compile("pq*");

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("pq*");


    }

    private static void validate(String text){
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()){
            System.out.println("Prawda dla tekstu: " + text);
        }
    }
}
