public class TimeCalc {
    public static void main(String[] args) {
        // Vérification du nombre d'arguments
        if (args.length != 2) {
            System.out.println("Usage: java TimeCalc <hh:mm> <minutesToAdd>");
            return;
        }

        String time = args[0];
        int minutesToAdd;

        // Validation du format de l'heure
        if (time.length() != 5 || time.charAt(2) != ':') {
            System.out.println("Invalid time format. Correct format is hh:mm.");
            return;
        }

        try {
            minutesToAdd = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number of minutes.");
            return;
        }

        // Extraction des heures et des minutes
        int hh = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
        int mm = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');

        // Vérification des limites des heures et minutes
        if (hh < 0 || hh >= 24 || mm < 0 || mm >= 60) {
            System.out.println("Invalid time value. Hours must be between 00 and 23, minutes between 00 and 59.");
            return;
        }

        // Calcul du nouveau temps
        int totalMinutes = hh * 60 + mm + minutesToAdd;
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;

        // Affichage du nouveau temps
        if (newHours < 10) System.out.print("0");
        System.out.print(newHours + ":");
        if (newMinutes < 10) System.out.print("0");
        System.out.println(newMinutes);
    }
}
