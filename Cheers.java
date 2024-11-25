public class Cheers {
    public static void main(String[] args) {
        String word = args[0];
        int counter = Integer.parseInt(args[1]);
        String vowels = "AEFHILMNORSX";

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                letter = (char) (letter - 'a' + 'A');
            }

            if (vowels.indexOf(letter) != -1) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            }
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < counter; i++) {
            System.out.println(word.toUpperCase() + "!!!");
        }
    }
}


}
