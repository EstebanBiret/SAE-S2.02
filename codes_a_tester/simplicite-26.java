import java.util.Scanner;

class RemoveSpaces{
  
  public static void main(String[] args) {
    String str = removeSpaces();
    System.out.println("\n" + str); // Appel à la fonction "removeSpaces"
  }

  public static String removeSpaces() {
    
    System.out.println("\nEntrez une chaine de caractères :");
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String tmp = ""; // Variable temporaire ou on stocke la chaine de caractère entrée
    int espace = 0; // Compteur d'espaces consécutifs
    
    for (int i = 0; i < str.trim().length(); i++) {
      int j = i;
      while (str.charAt(j) == ' ') {
        espace += 1;
        j += 1;
      }
      if (espace == 1) {
        if (str.charAt(i - 1) == ' ') {
          tmp += str.charAt(i);
        }
      } else {
        tmp += str.charAt(i);
      }
      espace = 0;
    }
    return tmp;  
  }
}