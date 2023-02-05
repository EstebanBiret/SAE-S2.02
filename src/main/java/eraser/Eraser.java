package eraser;

public class Eraser {
    public static String erase(String str) {
        StringBuilder s = new StringBuilder(str); //création d'un new StringBuilder à l'aide de la String fourni en paramètre

		for (int i =0; i<s.length(); i++) { //on la parcourt en entier

			if (i !=0 && i!=s.length()-1 && s.charAt(i)== 32 && s.charAt(i-1)!=32 && s.charAt(i+1)!=32 ) {  //on vérifie si il y a un espace simple 
				s.deleteCharAt(i);
			}
			else if (i==0 && s.charAt(i+1) != 32 && s.charAt(i) == 32) {  //on vérifie si le dernier caractère est un espace simple ou non
				s.deleteCharAt(i);	
			}
			else if (i==s.length()-1 && s.charAt(i-1) != 32 && s.charAt(i) == 32) {  //on vérifie si le premier caractère est un espace simple ou non
				s.deleteCharAt(i);
			}
		}
		return s.toString(); //on retourne la nouvelle StringBuilder avec les modifications
    }
}
