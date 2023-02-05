def bonmot(var):

   if var ==" " or var=="":
       return ("")
   space=0
   for i in var:
       if i == " ":
           space+=1
   if space==len(var):
       return(var)

   else:
       o=0
       if var[0] == " " and var[1] != " ":
            var = var[:0] + "" + var[1:]

       if var[-1] == " " and var[-2] != " ":
           var = var[:-1] + ""


       fin=0
       for i in range(-1,-len(var),-1):
          if var[i]==" ":
              fin +=1
          else:
            break


       print(fin)
       if (fin%2 ==0):
           o=0
       else:
           o=1
       NvMot=""
       strlen = len(var)

       i=0

       while i<strlen-o:
           if var[i]==" ":
               if var[i+1] ==" " or var[i-1]==" ":
                       NvMot+= var[i]
                       NvMot+= var[i+1]
                       i+=1
           else:
               NvMot += var[i]
           i+=1

       if (o>0):
          NvMot+=" "
       return (NvMot)