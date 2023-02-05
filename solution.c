
char* erase(char* chaine) {
  int size = strlen(chaine);
  char resultat[size];
  int j = 0;
  for (int i = 0; i < size; i++) {
    if (chaine[i] == ' ') {
      if ((i+1 < size && chaine[i+1] == ' ') || (i !=0 && chaine[i-1] == ' ')){
        resultat[j]=chaine[i];
        j++;
      }
    } 
    else 
    {
      resultat[j] = chaine[i];
      j++;
    }
  }
  return resultat; 
}    
