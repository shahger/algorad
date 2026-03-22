public class task9 {
    public static int length(String s) {
        if (s.equals("")) return 0;
        return 1 + length(s.substring(1));
    }
}