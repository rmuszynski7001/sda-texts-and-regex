package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex000 {

    private static final Pattern pattern = Pattern.compile("pq*");

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("pq*");

        Matcher matcher = pattern.matcher("p");

        System.out.println(matcher.find());
    }

    private static void validate(String text){
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()){
            System.out.println("Prawda dla tekstu: " + text);
        }
    }
}
