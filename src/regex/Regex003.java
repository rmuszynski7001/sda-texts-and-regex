package regex;

public class Regex003 {
    public static void main(String[] args) {
    RegexTester tester = new RegexTester("(\\+48)?5[0-9]{8}$");
    tester.validate("Java");
    tester.validate("Ja");
    tester.validate("+48504932837");
    tester.validate("459302998");
    tester.validate("548383002");
    tester.validate("J");
    tester.validate("aJ");
}
}
