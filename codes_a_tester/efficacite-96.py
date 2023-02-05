# return string without spaces
def erase(cc):
  nouvelle_chaine=""    
  taille = len(cc)
    
 
  if(taille>0):
    #premier caractère (si ce n'est pas un espace, ou qu'il y a un espace après, alors on recopie)
    if(cc[0]!=" " or cc[1]==" "):
        nouvelle_chaine+=cc[0]
        
    #tous les caractères sauf premier et dernier (si ce n'est pas un espace, ou qu'il y a un espace avant ou après, alors on recopie)
    for i in range (1, taille-1): 
        if(cc[i] != ' ' or cc[i - 1] == ' ' or cc[i + 1] == ' '):
            nouvelle_chaine+=cc[i]

    i=taille-1
    #dernier caractère (si ce n'est pas un espace, ou qu'il y a un espace avant, alors on recopie) 
    if(cc[i] != ' ' or cc[i - 1] == ' '):
       nouvelle_chaine+=cc[taille-1]
  return nouvelle_chaine

