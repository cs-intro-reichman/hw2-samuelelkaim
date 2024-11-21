public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int hh = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
        int mm = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = hh * 60 + mm + minutesToAdd;
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;

        if (newHours < 10) System.out.print("0");
        System.out.print(newHours + ":");
        if (newMinutes < 10) System.out.print("0");
        System.out.println(newMinutes);
    }
}
