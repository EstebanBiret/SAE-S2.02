package eraser;

public class Eraser {
    public static String erase(String str) {
        // Remplace tous les blancs précédés ou suivis de quoi que ce soit d'autre
        str = str.replaceAll("(\\S)\\s(\\S)", "$1$2");
        // Cas particulier du " "
        if (str.equals(" ")) 
            return "";
        if (str.length() > 1) {
            // Enlève un potentiel 1er espace (si au moins 1 caractère)
            if ((str.charAt(0) == ' ') && (str.charAt(1) != ' '))
                str = str.substring(1);
            if (str.length() > 1) 
                // Enlève un potentiel dernier espace (si au moins 2 caractères)
                if ((str.charAt(str.length()-1) == ' ') && (str.charAt(str.length()-2) != ' ') )
                    str = str.substring(0, str.length()-1);
        }
        return(str);
    }
}
