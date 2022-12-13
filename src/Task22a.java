public class Task22a {
    public static void main(String[] args) {


        String text = "MEZNY BADZ, CHRON PULK TWOJ I SZESC FLAG";
        int key = 2;
        String encryptedText = null;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int characterIndex = currentChar - (char) 'A';
            int characterShifted = characterIndex + key;
            characterShifted = characterShifted%26;


            encryptedText += (char) characterShifted;

        }
        System.out.println(encryptedText);
    }
}
