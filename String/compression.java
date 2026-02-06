package String;

public class compression {
    public static void main(String[] args) {
        String str = "aaabbbbcddddd";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer a = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                a++;
                i++;
            }
            sb.append(str.charAt(i));
            if (a > 1) {
                sb.append(a);
            }

        }
        System.out.println(sb.toString());
    }
}
