package main.java.eraser;

public class Eraser {
	
	/***
	 * Méthode permettant de supprimer les espaces simples et gardant les espaces multiples 
	 * @param str
	 * @return str 
	 */
    public static String erase(String str) {
    	int tailleM ;
    	String newStr = "";
    	int cmpt = 0;
        tailleM = str.length() ;
        
        for (int i = 0 ; i < tailleM ; i ++) {
        	char caract = str.charAt(i);
        	if (caract == ' ') {
            	cmpt ++; // Compte du nombre d'espace 
            }
        	else { 
        		if (cmpt > 1) { // Si le nombre  d'espace est suppérieur à 1 alors on les affiches 
        			for (int j = 0; j < cmpt ; j++) {
        				newStr += ' ';
        				}
        		
        		
        		}
        		cmpt = 0;
        		newStr += caract ;
        		}
        		
    
    
        }
		
        
        
        return newStr;
    
    
    
    }
}
    
    
    
 
    
   

