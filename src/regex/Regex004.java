package regex;

public class Regex004 {
    public static void main(String[] args) {
        RegexTester tester = new RegexTester("[A-Z][a-z]+[\\-]?[\\ ]?[A-Z]*[a-z]*$");
        tester.validate("WRoclaw");
        tester.validate("Zielona Gora");
        tester.validate("Ptysiow213");
        tester.validate("BielskoBiala");
        tester.validate("Zielona-----Gora");
        tester.validate("J");
        tester.validate("aJ");
    }
}
