tup1 = tuple(input("Enter the list1 comma separated values").split(","))

for x in tup1:
    if int(x)%5==0:
        print(x, " is divisible by 5")
    

#print (type(tup1))