#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "solution.h"

/** Permet de supprimer seulement les espaces individuels d'une chaîne de caractère
 * @param IN chaine : La chaîne de caractère à tester
 *@return la chaine
**/
char* erase2(char* chaine) {
  //Déclaration des attributs neécessaires
  int j = 0;

  for(int i = 0; chaine[i] != '\0'; i++) {
    if ((chaine[i] == ' ' && chaine[i+1] != ' ' && chaine[i-1] != ' ') != 1){
      chaine[j] = chaine[i];
      j++;
    }
  } 
 
  //Dernière case du tableau
  chaine[j] = '\0';

  return chaine;
}

