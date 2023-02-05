# return string without spaces
def erase(cc):
    nouveau = list(cc)
    chaine = ""
    for i in range (len(cc)):
        if nouveau[i] == " ":
            if i != 0 and nouveau[i-1] == " ":
                chaine+= nouveau[i]
            elif i+1 < len(cc) and nouveau[i+1] == " ":
                chaine+= nouveau[i]
        else: 
            chaine+= nouveau[i]

    return chaine
