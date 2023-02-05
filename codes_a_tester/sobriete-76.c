#include <stdio.h>
#include <stdlib.h>

char* erase(const char* chaine) {
  int i = 0;
  int compteur = 1;
  int j = 0;
  unsigned int len=0;
  while(*(chaine+len)) len++;
  char* chaine_erased = (char*) malloc(len);
    while(chaine[i] != '\0') {
      if(chaine[i] == ' ') {
        compteur = 1;
        while(chaine[i+compteur] != '\0' && chaine[i+compteur] == ' ') {
          chaine_erased[i-j+compteur] = ' ';
          compteur++;
        }
        if(compteur == 1) {
          j++;
        }else {
          chaine_erased[i-j] = ' ';
          i+=compteur-1;
        }
      }else {
          chaine_erased[i-j] = chaine[i];
      }
      i++;
    }
  return chaine_erased;
}