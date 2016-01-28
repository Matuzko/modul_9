package lecture9;


public class Caesar {
    public static String caesar(String name, boolean needToCrypt) {
        String finalString = " ";
        if (needToCrypt)
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if (c >= 'd' && c <= 'z') c -= 3;
                else if (c >= 'D' && c <= 'Z') c -= 3;
                else if (c >= 'a' && c <= 'c') c += 23;
                else if (c >= 'A' && c <= 'C') c += 23;
                finalString += c;
            }
        else {
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if (c >= 'x' && c <= 'z') c -= 23;
                else if (c >= 'X' && c <= 'Z') c -= 23;
                else if (c >= 'a' && c <= 'w') c += 3;
                else if (c >= 'A' && c <= 'W') c += 3;
                finalString += c;
            }
        }
        return finalString;
    }
}
