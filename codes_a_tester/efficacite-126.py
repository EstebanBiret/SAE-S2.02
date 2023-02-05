# return string without spaces
def erase(cc):
    re.sub("([^\s])\s([^\s])", r"\1\2", re.sub("([^\s])\s([^\s])", r"\1\2", cc).strip())
    
    pass
