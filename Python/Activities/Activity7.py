list1= []
num = int(input("Enter the no of elements are going to enter : "))
sum = 0
for i in range(num):
    x = int(input("Enter the element {} :".format(i)))
    list1.append(x)
for x in list1:
    sum+= x
print(" The Total sum of elements in the list is : ",sum)