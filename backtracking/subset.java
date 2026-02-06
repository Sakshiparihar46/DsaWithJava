public class subset {
    public static void printstr(String str, int i, String newstr) {
        if (i == str.length()) {
            if (newstr.length() == 0) {
                System.out.print("null");
            } else {
                System.out.print(newstr + " ");
            }
            return;
        }
        printstr(str, i + 1, newstr+str.charAt(i));
        printstr(str, i + 1, newstr);
    }

    public static void main(String[] args) {
        String str = "abc";
        printstr(str, 0, " ");
    }
}
