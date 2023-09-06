public class firstandlast {
    public static int first = -1;
    public static int last = -1;

    public static void find(int idx, String s, char element) {
        if (idx == s.length()) {
            if (first != -1) {
                System.out.println("First occurrence: " + first);
                System.out.println("Last occurrence: " + last);
            } else {
                System.out.println("Element not found in the string.");
            }
            return;
        }

        char current = s.charAt(idx);
        if (element == current) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        find(idx + 1, s, element);
    }

    public static void main(String[] args) {
        String s = "lkaashjdaawersaauaajhahu";
        find(0, s, 'a');
    }
}
