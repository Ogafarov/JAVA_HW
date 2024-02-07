public class Lesson5HomeWork {
    public static void main(String[] args) {
        System.out.println(getNumberinTelefon("A"));
        System.out.println(getNumberinTelefon("йены"));
    }

    public static int getNumberinTelefon(String t) {

        return switch (t) {
            case "A" -> 2;
            case "E" -> 3;
            case "H" -> 4;
            case "K" -> 5;
            case "M" -> 6;
            case "R" -> 7;
            case "U" -> 8;
            case "Z" -> 8;
            default -> -1;
        };
    }

    public static int getCurrencyName(String c) {

        return switch (c) {
            case "йены" -> "JPY";
            case "фунт" -> "GBP";
            case "доллар" -> "USD";
            case "евро" -> "EURO";
            case "тугрик" -> "MNT";
            default -> "MANAT";

        };

    }
}