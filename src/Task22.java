public class Task22 {

    private String text;
    private int key;

    private static String encrypt(String text, int key){
        text = text.toUpperCase();

        int textLength = text.length();
        String encryptedText = "";

        for (int i = 0; i < textLength; i++) {
            char currentChar = text.charAt(i);
            int characterIndex = currentChar - (char) 'A';
            int characterShifted = characterIndex + key;
            characterShifted = characterShifted%26;


            encryptedText += (char) characterShifted;



//            int tempCharIndex = (int) text.charAt(i);
//            int newCharIndex = tempCharIndex + key;
//            char newChar = (char) newCharIndex;
//
//            newText.charAt(i) = newChar;


        }
        return encryptedText;

    }

    public static void main(String[] args) {

        String encryptedTxt = encrypt("MEZNY BADZ, CHRON PULK TWOJ I SZESC FLAG",2);
        System.out.println(encryptedTxt);



    }
}
