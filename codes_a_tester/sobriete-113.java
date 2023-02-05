package eraser;

public class Eraser {
    public static String erase(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int size = str.length();
        while (i < size) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            }
            else {
                if (i + 1 < size && str.charAt(i + 1) == ' ') {
                    sb.append(ch);
                }
                int j = 1;

                while (i+j < size && str.charAt(i+j) == ' ') {
                    sb.append(str.charAt(i+j));
                    i++;
                } 
            }
            i++;
            }
        return sb.toString();
        }
    }
