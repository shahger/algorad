public class task8 {
    public static boolean onlyDigits(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return onlyDigits(s, i + 1);
    }
}
