package regex;

public class Regex005 {
    public static void main(String[] args) {

        String name = "[A-Z][a-z]+";
        RegexTester tester = new RegexTester(name);
        tester.validate("andrzej");
        tester.validate("Andrzej");
        tester.validate("AANdrzejek");
        tester.validate("202");
        tester.validate("asdfsadf");
        tester.validate("asdf");

        System.out.println("**************");

        String surname = "[A-Za-z][a-z]+(([ \\-]?[a-z]*)*[A-Z][a-z]*)?";
        RegexTester tester2 = new RegexTester(surname);
        tester2.validate("andrzej");
        tester2.validate("Andrzej");
        tester2.validate("AANdrzejek");
        tester2.validate("Bachleda-Curus");
        tester2.validate("von der Leyen");
        tester2.validate("de Silvia");
        tester2.validate("de VAN Silvia");
        tester2.validate("De Silvia");
        tester2.validate("de dsilvia");
    }
}
