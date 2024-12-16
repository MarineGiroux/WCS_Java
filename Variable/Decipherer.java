package Variable;

public class Decipherer {
    public static String decipher(String codedMessage) {
        int keyFigure = codedMessage.length() / 2;

        String substring = codedMessage.substring(5, 5 + keyFigure);

        String replacedLetters = substring.replace("@#?", " ");

        return new StringBuilder(replacedLetters).reverse().toString();

    }

    public static void main(String[] args) {
        String[] messages = {
                "0@sn9sirppa@#?ia'jgtvryko1",
                "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
                "aopi?sedohtém@#?sedhtmg+p9l!"
        };

        for (int i = 0; i < messages.length; i++) {
            String decodedMessage = decipher(messages[i]);
            System.out.println("Message déchiffré " + (i + 1) + " : " + decodedMessage);
        }
    }
}
