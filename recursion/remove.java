package recursion;

public class remove {
    public static void isnotdupliate(String str, int idx, StringBuilder newstr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        if (map[str.charAt(idx)-'a'] == true) {
            isnotdupliate(str, idx + 1, newstr, map);
        } else {
            map[str.charAt(idx)-'a'] = true;
            isnotdupliate(str, idx + 1, newstr.append(str.charAt(idx)), map);
        }
    }

    public static void main(String[] args) {
        String str = "apnacollege";
        boolean map[] = new boolean[26];
        StringBuilder newstr = new StringBuilder("");
        isnotdupliate(str, 0, newstr, map);
    }

}
