 # return string without spaces
def erase2(cc):
    chaine = ""
    for i in range(len(cc)):
        if i == len(cc) - 1 and cc[i] == " ":
            if cc[i] == " ":
                chaine += ""
            else:
                chaine += cc[-1]
            break

        if cc[i] != " ":
            chaine += cc[i]
        elif (cc[i] == " " and cc[i + 1]) == " " or (cc[i] == " " and cc[i - 1] == " "):
            chaine += cc[i]
        else:
            chaine += ""
    return chaine
